package com.gient.abstractFactory.benz;

import com.gient.abstractFactory.AbstractMirror;
import com.gient.abstractFactory.AbstractWheel;
import com.gient.abstractFactory.Car;

public class BenzCar extends Car{

	public BenzCar(AbstractMirror mirror, AbstractWheel wheel) {
		super(mirror, wheel);
		this.carType = "奔驰";
	}

}
