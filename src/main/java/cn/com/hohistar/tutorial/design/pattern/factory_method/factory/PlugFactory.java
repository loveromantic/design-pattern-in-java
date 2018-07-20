package cn.com.hohistar.tutorial.design.pattern.factory_method.factory;

import cn.com.hohistar.tutorial.design.pattern.factory_method.IDevice;
import cn.com.hohistar.tutorial.design.pattern.factory_method.IFactory;
import cn.com.hohistar.tutorial.design.pattern.factory_method.model.Plug;

public class PlugFactory implements IFactory {

	public IDevice createProduct() {
		return new Plug();
	}

}
