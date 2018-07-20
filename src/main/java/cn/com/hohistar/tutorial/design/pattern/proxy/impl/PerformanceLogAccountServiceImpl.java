package cn.com.hohistar.tutorial.design.pattern.proxy.impl;

import cn.com.hohistar.tutorial.design.pattern.proxy.IAccountService;

public class PerformanceLogAccountServiceImpl implements IAccountService {
	
	private IAccountService service = null;
	
	public PerformanceLogAccountServiceImpl(IAccountService service) {
		this.service = service;
	}

	@Override
	public void transfer(String fromId, String toId, Double amount) {

		long start = System.currentTimeMillis();
		
		service.transfer(fromId, toId, amount);
		
		long end = System.currentTimeMillis();
		
		System.out.println("The time of transfer is " + (end - start));
		
	}

}
