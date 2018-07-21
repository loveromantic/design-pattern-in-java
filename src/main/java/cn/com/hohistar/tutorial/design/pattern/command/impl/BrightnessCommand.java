package cn.com.hohistar.tutorial.design.pattern.command.impl;

public class BrightnessCommand extends AbstractCommand {

	private int brightness = 0;
	
	public BrightnessCommand(String deviceId, int brightness) {
		super(deviceId);
		this.brightness = brightness;
	}
	
	@Override
	public void execute() {
		System.out.println("set brightness to " + brightness);
	}

}
