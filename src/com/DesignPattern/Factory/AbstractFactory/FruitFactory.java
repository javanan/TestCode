package com.DesignPattern.Factory.AbstractFactory;

public class FruitFactory extends IFactory {

	@Override
	public <T extends Iproduct> T createProduct(Class<T> c) {
		T product=null;
		try {
			product=(T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  product;
	}

}
