package cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility.impl;

public class ConcreteHandler extends AbstractHandler {

	@Override
	public void handle() {
		
		if (getSuccessor() != null) {
			
			System.out.println("The request is passed to " + getSuccessor());
			getSuccessor().handle();
		} else {
			System.out.println("The request is handled here.");
		}
	}

}
