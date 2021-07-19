package com.design.patterns.manager.dispatcher;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;

public class ExistDispatcher extends Dispatcher {

	public ExistDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int code1 = Integer.parseInt(server.readLine());
		int amount1 = Integer.parseInt(server.readLine());
		server.println(store.exist(code1, amount1));
	}

	@Override
	public Dispatcher clone() {
		return new ExistDispatcher(store, server);
	}

}
