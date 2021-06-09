package com.design.patterns.utils;

public class ClosedInterval {

	private int min;
	
	private int max;

	public ClosedInterval(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean includes(int value) {
		return value <= max && value >= min;
	}
	
	int getMin() {
		return min;
	}

	int getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "[min=" + min + ", max=" + max + "]";
	}
}
