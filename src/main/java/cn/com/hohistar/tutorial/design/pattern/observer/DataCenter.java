package cn.com.hohistar.tutorial.design.pattern.observer;

public class DataCenter implements IObserver {

	@Override
	public void updateTurnOnOff(String deviceId, boolean turnOn) {
		
		System.out.println("received(DataCenter) deviceId = " + deviceId + ", turnOn = " + turnOn);
		
	}

}
