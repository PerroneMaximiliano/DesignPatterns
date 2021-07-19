package com.design.patterns.manager.manager;

import com.design.patterns.manager.store.Store;
import com.design.patterns.utils.Console;
import com.design.patterns.utils.LimitedIntDialog;

public abstract class Manager {

	private Store store;
	
	public Manager() {
		store = this.createStore();
	}

	protected abstract Store createStore();
	
	public void manage() {
		int option;
		do {
			this.showStore();
			option = this.executeMenu();
			if (option != 3) {
				int code = LimitedIntDialog.instance().read("Código? ", 100);
				int amount = LimitedIntDialog.instance().read("Cantidad? ", 100);
				switch (option) {
				case 1:
					store.add(code, amount);
					break;
				case 2:
					if (store.exist(code, amount)) {
						store.remove(code, amount);
					} else {
						Console.instance().writeln("No hay disponibles");
					}
					break;
				}
			}
		} while (option != 3); 
	}
	
	private void showStore() {
		int[][] list = store.list();
		Console.instance().writeln("STORE");
		for (int[] product : list) {
			Console.instance().writeln("Código: " + product[0] + ", cantidad:" + product[1]);
		}
		Console.instance().writeln();
	}

	private int executeMenu() {
		Console.instance().writeln("1. Alta de producto");
		Console.instance().writeln("2. Baja de producto");
		Console.instance().writeln("3. Salir");
		int option = LimitedIntDialog.instance().read("Opcion?", 3);
		return option;
	}
}
