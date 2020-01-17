package org.mmo.engine.io.message;

import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.mmo.engine.server.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 客户端消息处理类,为每个消息添加一个ID标识
 */
public final class IDMessage implements Runnable {

    @Autowired
    protected ServerProperties serverProperties;

    public static IDMessage newIDMessage(Object msg) {
        return new IDMessage(msg);
    }


    public static IDMessage newIDMessage(Channel channel, Object msg, long pid, int msgId) {
        return new IDMessage(channel, msg, pid,msgId);
    }

    /**纯消息内容*/
    private Object msg;
    /**玩家唯一编号*/
    private long pid;
    private Channel channel;
    /**消息唯一编号*/
    private int msgId;

    private IDMessage(Object msg) {
        this.pid = serverProperties.getId();
        this.msg = msg;
    }

    /**
     *
     * @param channel
     * @param msg byte[]
     * @param pid
     */
    private IDMessage(Channel channel, Object msg, long pid, int msgId) {
        if (msg instanceof Message || msg instanceof ByteBuf || msg instanceof byte[]) {
            this.msg = msg;
            this.pid = pid;
            this.channel = channel;
            this.msgId=msgId;
        } else {
            throw new RuntimeException("数据类型错误：" + msg.getClass().getName());
        }
    }

    public long getPid() {
        return pid;
    }

    public Channel getSession() {
        return channel;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    @Override
    public void run() {
        MsgUtil.sendClientMsg(channel, this);
    }

    public Object getMsg() {
        return msg;
    }
}
