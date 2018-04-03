package com.gient.abstractFactory;

public abstract class AbstractCarFactory {

	public abstract AbstractMirror createMirrors();
	public abstract AbstractWheel createWheels();
	public abstract Car build();
	
}
