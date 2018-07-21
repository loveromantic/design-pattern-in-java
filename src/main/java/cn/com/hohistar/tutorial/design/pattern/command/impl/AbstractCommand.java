package cn.com.hohistar.tutorial.design.pattern.command.impl;

import cn.com.hohistar.tutorial.design.pattern.command.ICommand;

public abstract class AbstractCommand implements ICommand {
	
	private String deviceId = null;
	

	public AbstractCommand(String deviceId) {
		this.deviceId = deviceId;
	}


}
