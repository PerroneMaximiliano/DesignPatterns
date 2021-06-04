package com.design.patterns.state.fine;

public abstract class Mood {
	
	protected Mood nextMood;
	
	protected abstract void eat();
	protected abstract void dance();
	protected abstract void work();
}
