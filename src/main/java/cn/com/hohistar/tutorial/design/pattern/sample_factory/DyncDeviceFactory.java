package cn.com.hohistar.tutorial.design.pattern.sample_factory;

public class DyncDeviceFactory {

	@SuppressWarnings("rawtypes")
	public IDevice createevice(String name) {
		
		IDevice device = null;
		
		try {
			Class cls = Class.forName(name);
			device = (IDevice) cls.newInstance();
			
		} catch(ClassNotFoundException e) {
			
		} catch(IllegalAccessException e) {
			
		} catch(InstantiationException e) {
			
		}
		
		return device;
	}


}
