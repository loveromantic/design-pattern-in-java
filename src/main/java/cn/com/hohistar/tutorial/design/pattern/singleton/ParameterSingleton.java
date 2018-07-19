package cn.com.hohistar.tutorial.design.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParameterSingleton {

	private static ParameterSingleton INSTANCE = null;
	
	private static Lock initlock = new ReentrantLock();

	private ParameterSingleton(String config) {
		
	}
	
	public static ParameterSingleton getInstance() {
		
		if (INSTANCE == null) {
			throw new RuntimeException("Must be init before using it.");
		}
		return INSTANCE;
	}
	
	public static ParameterSingleton getInstance(String config) {
		
		if (INSTANCE == null) {
			
			initlock.lock();
			try {
				if (INSTANCE == null) {
					INSTANCE = new ParameterSingleton(config);
				}
			} finally {
				initlock.unlock();
			}
		}
		return INSTANCE;
		
	}
}
