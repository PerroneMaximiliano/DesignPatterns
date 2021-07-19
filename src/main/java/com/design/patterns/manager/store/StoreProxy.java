package com.design.patterns.manager.store;

import com.design.patterns.manager.utils.FrameType;

public class StoreProxy implements Store {

	private Client client;
	
	public StoreProxy() {
		client = new Client();
	}

	@Override
	public void add(int code, int amount) {
		client.println(FrameType.ADD.name());
		client.println(code);
		client.println(amount);
	}

	@Override
	public boolean exist(int code, int amount) {
		client.println(FrameType.EXIST.name());
		client.println(code);
		client.println(amount);
		return client.readBoolean();
	}

	@Override
	public void remove(int code, int amount) {
		client.println(FrameType.REMOVE.name());
		client.println(code);
		client.println(amount);
	}

	@Override
	public int[][] list() {
		client.println(FrameType.LIST.name());
		int lines = client.readInt();
		int[][] list = new int[lines][2];
		for (int i=0; i<lines; i++) {
			list[i][0] = client.readInt();
			list[i][1] = client.readInt();
		}
		return list;
	}
	
	public void close() {
		client.close();
	}
}
