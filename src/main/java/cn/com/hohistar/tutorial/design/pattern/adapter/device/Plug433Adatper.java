package cn.com.hohistar.tutorial.design.pattern.adapter.device;

import cn.com.hohistar.tutorial.design.pattern.adapter.IDevice;
import cn.com.hohistar.tutorial.design.pattern.adapter.thirdparty.Plug433;

public class Plug433Adatper implements IDevice {

	private Plug433 device = null;
	
	public Plug433Adatper(Plug433 device) {
		this.device = device;
	}
	
	
	public void turnOn() {
		device.setStatus(1);
	}

	public void turnOff() {
		device.setStatus(0);
	}

}
