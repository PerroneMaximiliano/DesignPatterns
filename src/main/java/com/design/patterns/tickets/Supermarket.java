package com.design.patterns.tickets;

public class Supermarket {
	
	public void sell() {
		boolean cerrar = false;
		do {
			Ticket ticket = CountryFactory.instance().createTicket();
			Menu menu = CountryFactory.instance().createMenu();
			menu.execute(ticket);
		} while(!cerrar);
	}
	
	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
