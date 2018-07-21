package cn.com.hohistar.tutorial.design.pattern.flyweight.impl;

import cn.com.hohistar.tutorial.design.pattern.flyweight.ITranscation;
import cn.com.hohistar.tutorial.design.pattern.flyweight.TranscationType;

public class TranscationImpl implements ITranscation {
	
	private String accountId;
	
	private TranscationType type;
	
	private long timeout;
	
	private long startTime;
	
	public TranscationImpl(TranscationType type, long timeout) {
		this.type = type;
		this.timeout = timeout;
	}
	

	@Override
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public TranscationType getTransactionType() {
		
		return this.type;
	}

	@Override
	public void doTranscation() {

		System.out.println("do transcation for " + accountId);
	}

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	

}
