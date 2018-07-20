package cn.com.hohistar.tutorial.design.pattern.decorator.condiment;

import cn.com.hohistar.tutorial.design.pattern.decorator.IDrink;

public class MilkCondiment extends CondimentDecorator {

	public MilkCondiment(IDrink drink) {
		super(drink);
	}

	@Override
	public String getName() {
		return drink.getName() + " Milk";
	}

	@Override
	public Float cost() {
		return drink.cost() + 5;
	}

}
