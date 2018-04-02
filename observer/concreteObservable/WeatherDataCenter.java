package com.gient.observer.concreteObservable;

import java.util.ArrayList;

import com.gient.observer.Observable;
import com.gient.observer.Observer;

public class WeatherDataCenter implements Observable {

	private ArrayList<Observer> observerList = new ArrayList<>();
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherDataCenter(double temperature, double humidity, double pressure) {
		super();
		setMeasurements(temperature, humidity, pressure);
	}

	//添加一个订阅者
	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
		//被观察者（主题）一旦被观察者订阅，立即提示观察者更新为当前数据
		notifyObserver(observer);
	}

	//删除一个订阅者
	@Override
	public void removeObserver(Observer observer) {
		int index = observerList.indexOf(observer);
		if (index >= 0) {
			observerList.remove(index);
		} else {
			try {
				throw new Exception("订阅者不存在！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//通知所有的订阅者
	@Override
	public void notifyAllObservers() {

		for (Observer o : observerList) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	//通知指定的订阅者
	public void notifyObserver(Observer observer){
		observer.update(temperature, humidity, pressure);
	}

	public void measurementsChanged() {
		if (observerList.size() > 0) {
			notifyAllObservers();
		}
	}

	// 气象数据发生更新
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

}
