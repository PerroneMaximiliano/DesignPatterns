package com.design.patterns.manager.manager;

import com.design.patterns.manager.store.Store;
import com.design.patterns.manager.store.StoreImplementation;

public class StandaloneManager extends Manager {

	@Override
	protected Store createStore() {
		return new StoreImplementation();
	}

	public static void main(String[] args) {
		new StandaloneManager().manage();
	}
}
