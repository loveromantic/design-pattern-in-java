package cn.com.hohistar.tutorial.design.pattern.command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class CommandQueue {

	private BlockingQueue<ICommand> queue = null;
	
	public CommandQueue(int queueLenght) {
		
		queue = new LinkedBlockingQueue<ICommand>(queueLenght);
	}
	
	public void appendCommand(ICommand command) {
		queue.offer(command);
	}
	
	public ICommand getCommand() throws InterruptedException {
		return queue.poll(10, TimeUnit.MILLISECONDS);
	}
	
	public boolean hasCommand() {
		return !queue.isEmpty();
	}
	
	
}
