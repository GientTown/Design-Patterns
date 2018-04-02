package com.gient.observer;

public interface Observer {

	void update(double temperature, double humidity, double pressure);
	void subscribe(Observable subject);
	void unsubscribe();
	
}
