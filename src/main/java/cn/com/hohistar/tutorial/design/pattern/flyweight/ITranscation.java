package cn.com.hohistar.tutorial.design.pattern.flyweight;

public interface ITranscation {

	public void setAccountId(String accountId);
	
	public TranscationType getTransactionType();
	
	public void doTranscation();
	
	public long getTimeout();

	public long getStartTime();

	
}
