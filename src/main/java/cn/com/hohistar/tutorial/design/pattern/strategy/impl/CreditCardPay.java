package cn.com.hohistar.tutorial.design.pattern.strategy.impl;

import cn.com.hohistar.tutorial.design.pattern.strategy.IPay;

public class CreditCardPay implements IPay {

	@Override
	public void pay(String token, Double amount) {

		System.out.println("user use cash to pay");
	}

}
