package com.design.patterns.manager.store;

public class OffLineState implements State {
	
	private StoreImplementation storeImplementation;

	public OffLineState() {
		storeImplementation = new StoreImplementation();
	}

	public OffLineState(int[][] storeState) {
		this();
		for (int[] product : storeState) {
			storeImplementation.add(product[0], product[1]);
		}
	}

	@Override
	public void add(int code, int amount) {
		storeImplementation.add(code, amount);
	}

	@Override
	public boolean exist(int code, int amount) {
		return storeImplementation.exist(code, amount);
	}

	@Override
	public void remove(int code, int amount) {
		storeImplementation.remove(code, amount);
	}

	@Override
	public int[][] list() {
		return storeImplementation.list();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public State nextState() {
		try {
			OnlineState onLineStoreProxy = new OnlineState();
			int[][] list = storeImplementation.list();
			for (int[] product : list) {
				onLineStoreProxy.add(product[0], product[1]);
			}
			return onLineStoreProxy;
		} catch (Exception e) {
			return this;
		}
	}

}
