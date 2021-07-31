package com.design.patterns.manager.dispatcher;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;
import com.design.patterns.manager.utils.FrameType;

public class AddDispatcher extends Dispatcher {

	public AddDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int code = Integer.parseInt(server.readLine());
		int amount = Integer.parseInt(server.readLine());
		store.add(code, amount);
		server.println(FrameType.ACK.name());
	}

	@Override
	public Dispatcher clone() {
		return new AddDispatcher(store, server);
	}

}
