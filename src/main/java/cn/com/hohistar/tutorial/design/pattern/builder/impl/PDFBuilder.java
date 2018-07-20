package cn.com.hohistar.tutorial.design.pattern.builder.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.hohistar.tutorial.design.pattern.builder.IContent;
import cn.com.hohistar.tutorial.design.pattern.builder.IContentBuilder;

public class PDFBuilder implements IContentBuilder {

	private List<String> content = new ArrayList<String>();
	
	public void addText(String text) {
		content.add(text);
	}

	public void addImage(String imagePath) {
		content.add(imagePath);
	}

	public IContent build() {
		
		return new PDFContent(content);
	}

}
