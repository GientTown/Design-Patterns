package com.gient.observer.concreteObserver;

import com.gient.observer.DisplayElements;
import com.gient.observer.Observable;
import com.gient.observer.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElements {

	private Observable subject;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public CurrentConditionDisplay() {
		super();
	}

	public CurrentConditionDisplay(Observable subject) {
		super();
		this.subject = subject;
		/*//这里强转有什么不妥之处呢？
		//强制转型的目的：观察者一旦订阅被观察者（主题），立即更新数据
		if (subject instanceof WeatherDataCenter) {
			WeatherDataCenter weatherDataCenter = (WeatherDataCenter)subject;
			this.temperature = weatherDataCenter.getTemperature();
			this.humidity = weatherDataCenter.getHumidity();
			this.pressure = weatherDataCenter.getPressure();
		}*/
		
		//订阅这个可观察者（主题）
		subscribe(subject);
	}

	//更新数据，并显示
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	//显示当前数据
	@Override
	public void display() {
		System.out.println(temperature + "-" + humidity + "-" + pressure);
	}

	//订阅一个主题（可观察者）
	@Override
	public void subscribe(Observable subject) {
		subject.addObserver(this);
	}

	//取消订阅
	@Override
	public void unsubscribe() {
		//集合装可观察者？
		//简单起见，暂时不考虑订阅了多个主题
		subject.removeObserver(this);
	}
}
