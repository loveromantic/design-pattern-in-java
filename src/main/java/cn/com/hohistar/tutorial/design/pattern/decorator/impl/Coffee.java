package cn.com.hohistar.tutorial.design.pattern.decorator.impl;

import cn.com.hohistar.tutorial.design.pattern.decorator.IDrink;

public class Coffee implements IDrink {

	private String name = null;
	
	private Float cost = null;
	
	public Coffee(String name, Float cost) {
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Float cost() {
		return cost;
	}

}
