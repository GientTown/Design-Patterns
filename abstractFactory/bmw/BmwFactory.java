package com.gient.abstractFactory.bmw;

import com.gient.abstractFactory.AbstractCarFactory;
import com.gient.abstractFactory.AbstractMirror;
import com.gient.abstractFactory.AbstractWheel;
import com.gient.abstractFactory.Car;

public class BmwFactory extends AbstractCarFactory {

	private String carType = "宝马";
	
	@Override
	public BmwMirror createMirrors() {
		return new BmwMirror();
	}

	@Override
	public BmwWheel createWheels() {
		return new BmwWheel();
	}

	@Override
	public Car build() {
		
		BmwMirror mirror = this.createMirrors();
		BmwWheel wheel = this.createWheels();
		
		return new BmwCar(mirror, wheel);
	}

}
