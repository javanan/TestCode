package com.DesignPattern.Template;

public class Tea extends Beverage {

	@Override
	public void addCoundiments() {
		 System.out.println("添加蜂蜜");  

	}

	@Override
	public void brew() {
		System.out.println("用水冲茶");  

	}

	@Override
	public void hook() {
		System.out.println("再来一杯----------------");
	}

	
}
