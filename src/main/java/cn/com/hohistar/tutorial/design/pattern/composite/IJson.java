package cn.com.hohistar.tutorial.design.pattern.composite;

public interface IJson {

	public Integer getInteger(String key);
	
	public String getString(String key);
	
	public IJson getJson(String key);
	
}
