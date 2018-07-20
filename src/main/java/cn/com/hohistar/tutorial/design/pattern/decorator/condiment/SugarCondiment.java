package cn.com.hohistar.tutorial.design.pattern.decorator.condiment;

import cn.com.hohistar.tutorial.design.pattern.decorator.IDrink;

public class SugarCondiment extends CondimentDecorator {

	public SugarCondiment(IDrink drink) {
		super(drink);
	}

	@Override
	public String getName() {
		return drink.getName() + " Sugar";
	}

	@Override
	public Float cost() {
		return drink.cost() + 2;
	}
}
