package cn.com.hohistar.tutorial.design.pattern.sample_factory;

public class DeviceFactory {

	public IDevice createevice(String name) {
		
		IDevice device = null;
		
		if ("Light".equals(name)) {
			device = new Light();
		} else if ("Plug".equals(name)) {
			device = new Plug();
		}
		return device;
	}
	
}
