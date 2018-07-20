package cn.com.hohistar.tutorial.design.pattern.decorator;

import org.junit.Test;

import cn.com.hohistar.tutorial.design.pattern.decorator.condiment.MilkCondiment;
import cn.com.hohistar.tutorial.design.pattern.decorator.condiment.SugarCondiment;
import cn.com.hohistar.tutorial.design.pattern.decorator.impl.Coffee;

public class DecoratorTester {

	
	@Test
	public void testCost() {
		
		IDrink drink = new Coffee("拿铁", 20f);

		System.out.println(drink.getName() + ": " + drink.cost());

		drink = new MilkCondiment(drink);

		System.out.println(drink.getName() + ": " + drink.cost());

		drink = new SugarCondiment(drink);
		
		System.out.println(drink.getName() + ": " + drink.cost());
		
		
		
	}
}
