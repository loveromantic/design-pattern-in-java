package cn.com.hohistar.tutorial.design.pattern.composite.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.hohistar.tutorial.design.pattern.composite.ICompany;

public class CompanyImpl implements ICompany {

	private String name = null;

	private List<ICompany> subCompanies = new ArrayList<ICompany>();

	public CompanyImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(ICompany company) {
		subCompanies.add(company);
	}

	public void remove(ICompany company) {
		subCompanies.remove(company);
	}

	public void show() {

		System.out.println(name);

		subCompanies.forEach(c -> {
			c.show();
		});

	}

}
