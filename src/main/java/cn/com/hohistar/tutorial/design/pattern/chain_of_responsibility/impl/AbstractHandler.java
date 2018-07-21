package cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility.impl;

import cn.com.hohistar.tutorial.design.pattern.chain_of_responsibility.IHandler;

public abstract class AbstractHandler implements IHandler {

	private IHandler successor;
	
	public void setSuccessor(IHandler successor) {
		this.successor = successor;
	}
	
	public IHandler getSuccessor() {
		return successor;
	}
	
}
