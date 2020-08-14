package org.mmo.game.service;

import org.mmo.engine.io.grpc.RpcProperties;
import org.mmo.engine.server.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 获取Service对象，脚本不能通过spring获取service对象
 */
@Service
public class GameManager {
	private static GameManager instance;

	@Autowired
	ExecutorService executorService;

	@Autowired
	ServerProperties serverProperties;

	@Autowired
	RpcProperties rpcProperties;

	@Autowired
	GameToClusterRpcService gameToClusterRpcService;


	@PostConstruct()
	public void Init() {
		instance=this;
	}

	public static GameManager getInstance(){
		return instance;
	}
	

	public ServerProperties getServerProperties() {
		return serverProperties;
	}


	public RpcProperties getRpcProperties() {
		return rpcProperties;
	}

	public ExecutorService getExecutorService() {
		return executorService;
	}

	public GameToClusterRpcService getGameToClusterRpcService() {
		return gameToClusterRpcService;
	}
}
