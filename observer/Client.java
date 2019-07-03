package com.gient.observer;

import com.gient.observer.concreteObservable.WeatherDataCenter;
import com.gient.observer.concreteObserver.CurrentConditionDisplay;

/**
 * 测试客户端
 * @author gient
 *
 */
public class Client {
	// 测试=====
	public static void main(String[] args) {
		WeatherDataCenter weatherDataCenter = new WeatherDataCenter(2.0, 2.0, 2.0);
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherDataCenter);
//		CurrentConditionDisplay display2 = new CurrentConditionDisplay(weatherDataCenter);
		weatherDataCenter.setMeasurements(2.0, 3.0, 5.0);
	}
}
