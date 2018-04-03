package com.gient.abstractFactory;

public class Car {

	protected String carType;
	
	protected AbstractMirror mirror;
	protected AbstractWheel wheel;
	public Car(AbstractMirror mirror, AbstractWheel wheel) {
		super();
		this.mirror = mirror;
		this.wheel = wheel;
	}
	
	public void move(){
		System.out.println(carType + " 正在行驶！");
	}
	
	public AbstractMirror getMirror() {
		return mirror;
	}
	public void setMirror(AbstractMirror mirror) {
		this.mirror = mirror;
	}
	public AbstractWheel getWheel() {
		return wheel;
	}
	public void setWheel(AbstractWheel wheel) {
		this.wheel = wheel;
	}
}
