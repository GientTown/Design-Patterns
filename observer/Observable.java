package com.gient.observer;

/**
 * 可观察者接口，即主题
 * @author gient
 *
 */
public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyAllObservers();
}
