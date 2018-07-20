package cn.com.hohistar.tutorial.design.pattern.proxy.impl;

import cn.com.hohistar.tutorial.design.pattern.proxy.IAccountService;

public class AccountServiceImpl implements IAccountService {

	@Override
	public void transfer(String fromId, String toId, Double amount) {
		
		System.out.println("executing transfer...");
	}

}
