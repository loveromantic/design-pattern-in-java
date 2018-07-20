package cn.com.hohistar.tutorial.design.pattern.composite;

import org.junit.Test;

import cn.com.hohistar.tutorial.design.pattern.composite.impl.CompanyImpl;

public class CompanyTester {

	@Test
	public void testShow() {
		
		ICompany root = new CompanyImpl("总公司");
		
		ICompany gd = new CompanyImpl("广东分公司");
		
		ICompany sh = new CompanyImpl("上海分公司");
		
		ICompany hr = new CompanyImpl("广东分公司人事部");
		
		root.add(gd);
		root.add(sh);
		gd.add(hr);
		
		root.show();
		System.out.println("============");
		gd.show();
		
	}
}
