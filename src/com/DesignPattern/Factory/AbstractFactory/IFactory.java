package com.DesignPattern.Factory.AbstractFactory;

public abstract class IFactory {

	public abstract <T extends Iproduct> T createProduct(Class<T> c);
}
