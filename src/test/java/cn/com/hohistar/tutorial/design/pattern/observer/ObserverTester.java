package cn.com.hohistar.tutorial.design.pattern.observer;

import org.junit.Test;

import cn.com.hohistar.tutorial.design.pattern.observer.impl.Plug;

public class ObserverTester {

	
	@Test
	public void testOberver() {
		
		Plug plug = new Plug("x1");
		plug.addObserver(new DataCenter());
		
		plug.turnOn(true);
		
	}
}
