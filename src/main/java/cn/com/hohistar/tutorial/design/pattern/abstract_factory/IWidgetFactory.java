package cn.com.hohistar.tutorial.design.pattern.abstract_factory;

import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.IButton;
import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.IWindow;

public interface IWidgetFactory {

	public IWindow createWindow();
	
	public IButton createButton();
	
}
