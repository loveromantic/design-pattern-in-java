package cn.com.hohistar.tutorial.design.pattern.composite;

public interface ICompany {

	public String getName();
	
	public void add(ICompany company);
	
	public void remove(ICompany company);
	
	public void show();
	
}
