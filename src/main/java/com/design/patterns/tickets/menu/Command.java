package com.design.patterns.tickets.menu;

import com.design.patterns.tickets.ticket.Ticket;

public abstract class Command {

	private String title;
	
	protected Ticket ticket;
	
	protected Command(String title) {
		this.title = title;
	}
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void execute();
}
