package com.design.patterns.manager.manager;

import com.design.patterns.manager.store.StoreProxy;
import com.design.patterns.manager.store.Store;

public class ClientManager extends Manager {

	@Override
	protected Store createStore() {
		return new StoreProxy();
	}
	
	@Override
	public void manage() {
		super.manage();
		((StoreProxy) store).close();
	}

	public static void main(String[] args) {
		new ClientManager().manage();
	}
}
