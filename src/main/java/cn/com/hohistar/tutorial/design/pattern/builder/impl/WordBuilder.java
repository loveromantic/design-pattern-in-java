package cn.com.hohistar.tutorial.design.pattern.builder.impl;

import cn.com.hohistar.tutorial.design.pattern.builder.IContent;
import cn.com.hohistar.tutorial.design.pattern.builder.IContentBuilder;

public class WordBuilder implements IContentBuilder {

	private StringBuffer buf = new StringBuffer();
	
	public void addText(String text) {
		buf.append(text);
	}

	public void addImage(String imagePath) {
		buf.append(imagePath);
	}

	public IContent build() {
		
		return new WordContent(buf.toString());
	}

}
