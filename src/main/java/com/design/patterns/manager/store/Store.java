package com.design.patterns.manager.store;

public interface Store {

	void add(int code, int amount);

	boolean exist(int code, int amount);

	void remove(int code, int amount);
	
	int[][] list();
}
