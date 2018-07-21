package cn.com.hohistar.tutorial.design.pattern.observer.impl;

public class Plug extends AbstractDevice {

	private boolean turnOn = false;
	
	public Plug(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn(boolean turnOn) {
		
		this.turnOn = turnOn;
		
		notifyObserver();
	}

	@Override
	public void notifyObserver() {

		this.observers.forEach( o -> {
			o.updateTurnOnOff(deviceId, turnOn);
		});

	}

}
