package cn.com.hohistar.tutorial.design.pattern.singleton;

public class EagerSingleton {

	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	/**
	 * private method - 
	 * 私有构造方法，阻止从外部构造实例
	 */
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
	
}
