package cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility;

import org.junit.Test;

import cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility.impl.AbstractHandler;
import cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility.impl.ConcreteHandler;

public class HandlerTester {

	@Test
	public void testHandle() {
		
		AbstractHandler handler1 = new ConcreteHandler();
		AbstractHandler handler2 = new ConcreteHandler();
		
		handler1.setSuccessor(handler2);
		handler1.handle();
		
	}
}
