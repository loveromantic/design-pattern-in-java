package cn.com.hohistar.tutorial.design.pattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.hohistar.tutorial.design.pattern.observer.IDevice;
import cn.com.hohistar.tutorial.design.pattern.observer.IObserver;

public abstract class AbstractDevice implements IDevice {
	
	protected String deviceId;
	
	protected List<IObserver> observers = new ArrayList<IObserver>();
	
	public AbstractDevice(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public void addObserver(IObserver o) {
		
		this.observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		
		this.observers.remove(o);
	}



}
