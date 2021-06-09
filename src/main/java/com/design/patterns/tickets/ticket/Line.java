package com.design.patterns.tickets.ticket;

public abstract class Line {

	protected int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return ", price=" + price;
	}
}
