package cn.com.hohistar.tutorial.design.pattern.composite.impl;

import java.util.HashMap;
import java.util.Map;

import cn.com.hohistar.tutorial.design.pattern.composite.IJson;

public class JsonObject implements IJson {
	
	private Map<String, Object> nodes = new HashMap<String, Object>();

	public Integer getInteger(String key) {
		return (Integer) nodes.get(key);
	}

	public String getString(String key) {
		return (String) nodes.get(key);
	}

	public IJson getJson(String key) {
		return (IJson) nodes.get(key);
	}
	
}
