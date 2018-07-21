package cn.com.hohistar.tutorial.design.pattern.command;

import org.junit.Test;

import cn.com.hohistar.tutorial.design.pattern.command.impl.BrightnessCommand;
import cn.com.hohistar.tutorial.design.pattern.command.impl.TurnOnOffCommand;

public class CommandTester {

	
	@Test
	public void testCommand() {
		
		ICommand cmd1 = new TurnOnOffCommand("x1", true);
		ICommand cmd2 = new BrightnessCommand("x2", 80);
		
		CommandQueue cmds = new CommandQueue(20);
		
		cmds.appendCommand(cmd1);
		cmds.appendCommand(cmd2);
		
		while(cmds.hasCommand()) {
			ICommand cmd;
			try {
				cmd = cmds.getCommand();
				cmd.execute();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
