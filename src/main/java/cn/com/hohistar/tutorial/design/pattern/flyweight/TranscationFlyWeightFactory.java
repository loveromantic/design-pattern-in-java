package cn.com.hohistar.tutorial.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import cn.com.hohistar.tutorial.design.pattern.flyweight.impl.TranscationImpl;

public class TranscationFlyWeightFactory {

	private Map<TranscationType, BlockingQueue<ITranscation>> flyweight = new HashMap<TranscationType, BlockingQueue<ITranscation>>();
	
	public TranscationFlyWeightFactory() {
		
		int depositSize = 10; // will from configuration file or database
		BlockingQueue<ITranscation> depositQueue = new LinkedBlockingQueue<ITranscation>(depositSize);
		for(int i = 0; i < depositSize; i++) {
			ITranscation trans = new TranscationImpl(TranscationType.DEPOSIT, 200);
			depositQueue.offer(trans);
		}
		flyweight.put(TranscationType.DEPOSIT, depositQueue);
		
		int drawSize = 10; // will from configuration file or database
		BlockingQueue<ITranscation> drawQueue = new LinkedBlockingQueue<ITranscation>(drawSize);
		for(int i = 0; i < drawSize; i++) {
			ITranscation trans = new TranscationImpl(TranscationType.DRAW, 800);
			depositQueue.offer(trans);
		}
		flyweight.put(TranscationType.DRAW, depositQueue);
		
	}
	
	public ITranscation getTranscation(TranscationType type) throws InterruptedException {
		
		BlockingQueue<ITranscation> queue = flyweight.get(type);
		ITranscation trans = queue.poll(100, TimeUnit.MILLISECONDS);
		
		return trans;
	}
	
	public void back(ITranscation trans) {
		
		BlockingQueue<ITranscation> queue = flyweight.get(trans.getTransactionType());
		
		queue.offer(trans);
		
	}
	
}
