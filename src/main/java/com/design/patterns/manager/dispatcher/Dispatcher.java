package com.design.patterns.manager.dispatcher;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;

public abstract class Dispatcher {
	
	protected Store store;
	
	protected Server server;
	
	public Dispatcher(Store store, Server server) {
		this.store = store;
		this.server = server;
	}
	
	public abstract void dispatch();
	
	public abstract Dispatcher clone();
}
