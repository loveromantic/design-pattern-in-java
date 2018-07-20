package cn.com.hohistar.tutorial.design.pattern.decorator.condiment;

import cn.com.hohistar.tutorial.design.pattern.decorator.IDrink;

public abstract class CondimentDecorator implements IDrink {

	protected IDrink drink = null;
	
	public CondimentDecorator(IDrink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getName() {
		return drink.getName();
	}

	@Override
	public Float cost() {
		return drink.cost();
	}

}
