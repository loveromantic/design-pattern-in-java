package cn.com.hohistar.tutorial.design.pattern.builder;

public interface IContentBuilder {

	// add component
	public void addText(String text);
	
	public void addImage(String imagePath);
	
	// build the final product
	public IContent build();
}
