package com.gient.abstractFactory.benz;

import com.gient.abstractFactory.AbstractCarFactory;
import com.gient.abstractFactory.AbstractMirror;
import com.gient.abstractFactory.AbstractWheel;
import com.gient.abstractFactory.Car;

public class BenzFactory extends AbstractCarFactory {

	//汽车类型默认是奔驰
	private String carType = "奔驰";

	@Override
	public BenzMirror createMirrors() {
		return new BenzMirror();
	}

	@Override
	public BenzWheel createWheels() {
		return new BenzWheel();
	}

	@Override
	public Car build() {
		
		BenzMirror mirror = this.createMirrors();
		BenzWheel wheel = this.createWheels();
		
		return new BenzCar(mirror, wheel);
	}
	
	
}
