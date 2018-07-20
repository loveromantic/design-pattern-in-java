package cn.com.hohistar.tutorial.design.pattern.factory_method.factory;

import cn.com.hohistar.tutorial.design.pattern.factory_method.IDevice;
import cn.com.hohistar.tutorial.design.pattern.factory_method.IFactory;
import cn.com.hohistar.tutorial.design.pattern.factory_method.model.Light;

public class LightFactory implements IFactory {

	public IDevice createProduct() {
		return new Light();
	}

}
