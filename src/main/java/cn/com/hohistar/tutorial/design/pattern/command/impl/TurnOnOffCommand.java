package cn.com.hohistar.tutorial.design.pattern.command.impl;

public class TurnOnOffCommand extends AbstractCommand  {
	
	private boolean turnOn = false;
	
	public TurnOnOffCommand(String deviceId, boolean turnOn) {
		super(deviceId);
		this.turnOn = turnOn;
	}

	@Override
	public void execute() {
		
		System.out.println("set turn on to " + turnOn);
	}

}
