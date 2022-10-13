package org.jzy.game.api.server;

import com.alibaba.fastjson.JSONObject;
import com.jzy.javalib.network.io.handler.Handler;
import org.jzy.game.api.service.ApiManager;
import org.jzy.game.common.util.RpcHttpHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 关服
 *
 * @author jzy
 * @mail 359135103@qq.com
 */
@Handler(path = "/server/gm/close")
public class CloseServerHandler extends RpcHttpHandler {
    public static final Logger LOGGER = LoggerFactory.getLogger(CloseServerHandler.class);

    @Override
    public void run() {
        JSONObject jsonParams = getJsonParams();
        LOGGER.info("apl close....{}", jsonParams.getString("test"));
        getBuilder().setResult("关服成功");

        //延迟关服
        ApiManager.getInstance().getLoginService().schedule(() -> Runtime.getRuntime().exit(0), 5000, TimeUnit.MILLISECONDS);
    }
}
