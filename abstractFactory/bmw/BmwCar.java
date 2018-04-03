package com.gient.abstractFactory.bmw;

import com.gient.abstractFactory.AbstractMirror;
import com.gient.abstractFactory.AbstractWheel;
import com.gient.abstractFactory.Car;

public class BmwCar extends Car{

	public BmwCar(AbstractMirror mirror, AbstractWheel wheel) {
		super(mirror, wheel);
		this.carType = "宝马";
	}

}
