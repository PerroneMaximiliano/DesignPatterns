package com.design.patterns.manager.dispatcher;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;

public class RemoveDispatcher extends Dispatcher {

	public RemoveDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int code2 = Integer.parseInt(server.readLine());
		int amount2 = Integer.parseInt(server.readLine());
		store.remove(code2, amount2);
	}

	@Override
	public Dispatcher clone() {
		return new RemoveDispatcher(store, server);
	}
}
