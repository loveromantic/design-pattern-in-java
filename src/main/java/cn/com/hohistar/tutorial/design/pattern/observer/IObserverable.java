package cn.com.hohistar.tutorial.design.pattern.observer;


public interface IObserverable {

	public void addObserver(IObserver o);
	
	public void removeObserver(IObserver o);
	
	public void notifyObserver();
}
