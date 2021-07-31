package com.design.patterns.manager.store;

public class StoreProxy implements Store {

	private State lineState;
	
	public StoreProxy() {
		try {
			lineState = new OnlineState();
		} catch (Exception e) {
			lineState = new OffLineState();
		}
	}

	@Override
	public void add(int code, int amount) {
		lineState.add(code, amount);
		lineState = lineState.nextState();
	}

	@Override
	public boolean exist(int code, int amount) {
		boolean result = lineState.exist(code, amount);
		lineState = lineState.nextState();
		return result;
	}

	@Override
	public void remove(int code, int amount) {
		lineState.remove(code, amount);
		lineState = lineState.nextState();
	}

	@Override
	public int[][] list() {
		int[][] result = lineState.list();
		lineState = lineState.nextState();
		return result;
	}
	
	public void close() {
		lineState.close();
	}
}
