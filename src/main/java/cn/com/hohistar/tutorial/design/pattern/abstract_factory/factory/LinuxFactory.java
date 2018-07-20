package cn.com.hohistar.tutorial.design.pattern.abstract_factory.factory;

import cn.com.hohistar.tutorial.design.pattern.abstract_factory.IWidgetFactory;
import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.IButton;
import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.IWindow;
import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.impl.linux.Button;
import cn.com.hohistar.tutorial.design.pattern.abstract_factory.widget.impl.linux.Window;

public class LinuxFactory implements IWidgetFactory {

	public IWindow createWindow() {
		
		return new Window();
	}

	public IButton createButton() {
		
		return new Button();
	}

}

