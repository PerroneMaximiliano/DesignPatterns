package com.design.patterns.manager.dispatcher;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;

public class ListDispatcher extends Dispatcher {

	public ListDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int[][] list = store.list();
		server.println(list.length);
		for (int[] product : list) {
			server.println(product[0]);
			server.println(product[1]);
		}
	}

	@Override
	public Dispatcher clone() {
		return new ListDispatcher(store, server);
	}

}
