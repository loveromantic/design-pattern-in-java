package cn.com.hohistar.tutorial.design.pattern.builder.impl;

import java.io.OutputStream;
import java.util.List;

import cn.com.hohistar.tutorial.design.pattern.builder.IContent;

public class PDFContent implements IContent {

	private List<String> content = null;
	
	public PDFContent(List<String> content) {
		this.content = content;
	}
	
	public OutputStream export() {
		// TODO Auto-generated method stub
		return null;
	}

}
