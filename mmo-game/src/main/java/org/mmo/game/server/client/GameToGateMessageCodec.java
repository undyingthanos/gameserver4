package org.mmo.game.server.client;

import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageCodec;
import org.mmo.engine.io.message.CrossMessage;
import org.mmo.engine.io.message.IdMessage;
import org.mmo.engine.io.message.MsgType;
import org.mmo.engine.io.message.MsgUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 解析与Gate服连接的消息
 * 
 * @author JiangZhiYong
 */
public class GameToGateMessageCodec extends ByteToMessageCodec<Object> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameToGateMessageCodec.class);
    /** 消息头长度，除去消息长度 消息类型2+玩家ID8 +消息ID4 */
    private static final int HEADER_EXCLUDE_LENGHT = 14;

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        if (msg instanceof ByteBuf) {
            out.writeBytes((ByteBuf) msg);
        } else if (msg instanceof IdMessage) {
            IdMessage idMessage=(IdMessage)msg;
            if(idMessage.getMsg() instanceof byte[]) {
                byte[] bytes=(byte[])idMessage.getMsg();
                out.writeInt(HEADER_EXCLUDE_LENGHT+bytes.length);
                out.writeShort(MsgType.IDMESSAGE.getType());
                out.writeLong(idMessage.getId());
                out.writeInt(idMessage.getMsgId());
                out.writeBytes(bytes);
            }else if(idMessage.getMsg() instanceof Message){
                Message message = (Message) idMessage.getMsg();
                byte[] bytes = message.toByteArray();
                out.writeInt(HEADER_EXCLUDE_LENGHT+bytes.length);
                out.writeShort(MsgType.IDMESSAGE.getType());
                out.writeLong(idMessage.getId());
                out.writeInt(idMessage.getMsgId());
                out.writeBytes(bytes);
            }else {
                LOGGER.warn("IDMessage加密类型{}未实现", idMessage.getMsg().getClass().getSimpleName());
            }
        } else {
            LOGGER.warn("未知的数据类型{}", msg.getClass().getName());
            return;
        }

    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        MsgUtil.decode(ctx, in, out);
    }

}
