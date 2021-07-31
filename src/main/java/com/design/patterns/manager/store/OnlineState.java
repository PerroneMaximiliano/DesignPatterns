package com.design.patterns.manager.store;

import com.design.patterns.manager.utils.FrameType;

public class OnlineState implements State {
	
	private Client client;
	
	private OffLineState offLineState;
	
	private int[][] storeState;
	
	public OnlineState() throws Exception {
		client = new Client();
	}

	@Override
	public void add(int code, int amount) {
		try {
			client.println(FrameType.ADD.name());
			client.println(code);
			client.println(amount);
			client.readACK();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			offLineState.add(code, amount);
		}
	}

	@Override
	public boolean exist(int code, int amount) {
		try {
			client.println(FrameType.EXIST.name());
			client.println(code);
			client.println(amount);
			return client.readBoolean();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			return offLineState.exist(code, amount);
		}
	}

	@Override
	public void remove(int code, int amount) {
		try {
			client.println(FrameType.REMOVE.name());
			client.println(code);
			client.println(amount);
			client.readACK();
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			offLineState.remove(code, amount);
		}
	}

	@Override
	public int[][] list() {
		try {
			client.println(FrameType.LIST.name());
			client.readACK();
			int lines = client.readInt();
			int[][] list = new int[lines][2];
			for (int i=0; i<lines; i++) {
				list[i][0] = client.readInt();
				list[i][1] = client.readInt();
			}
			return list;
		} catch (Exception ex) {
			offLineState = new OffLineState(storeState);
			return offLineState.list();
		}
	}
	
	public void close() {
		client.close();
	}

	@Override
	public State nextState() {
		if (offLineState != null) {
			return offLineState;
		} else {
			return this;
		}
	}

}
