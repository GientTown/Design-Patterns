package com.gient.abstractFactory;

import com.gient.abstractFactory.benz.BenzFactory;
import com.gient.abstractFactory.bmw.BmwFactory;

public class Client {

	public static void main(String[] args) {
		AbstractCarFactory carFactory = new BenzFactory();
		AbstractCarFactory carFactory1 = new BmwFactory();
		Car car = carFactory.build();
		Car car1 = carFactory1.build();
		car.move();
		car1.move();
	}
	
}
