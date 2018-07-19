package cn.com.hohistar.tutorial.design.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LazySingleton {

	private static LazySingleton INSTANCE = null;
	
	private static Lock initlock = new ReentrantLock();
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		
		if (INSTANCE == null) {
		
			initlock.lock();
			try {
				if (INSTANCE == null) {
					INSTANCE = new LazySingleton();
				}
			} finally {
				initlock.unlock();
			}
		}
		return INSTANCE;
	}
	
	
}
