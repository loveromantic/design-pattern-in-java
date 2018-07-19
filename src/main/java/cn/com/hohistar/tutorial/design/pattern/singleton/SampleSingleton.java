package cn.com.hohistar.tutorial.design.pattern.singleton;

public class SampleSingleton {

	private static final SampleSingleton INSTANCE = new SampleSingleton();
	
	/**
	 * private method - 
	 * 私有构造方法，阻止从外部构造实例
	 */
	private SampleSingleton() {
		
	}
	
	public static SampleSingleton getInstance() {
		return INSTANCE;
	}
	
}
