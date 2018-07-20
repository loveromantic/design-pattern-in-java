package cn.com.hohistar.tutorial.design.pattern.builder.impl;

import java.io.OutputStream;

import cn.com.hohistar.tutorial.design.pattern.builder.IContent;

public class WordContent implements IContent {

	private String text = null;
	
	public WordContent(String text) {
		this.text = text;
	}
	
	public OutputStream export() {
		// TODO Auto-generated method stub
		return null;
	}

}
