package com.DesignPattern.Template;

public abstract class Beverage {

	/**
	 * 冲泡饮品的流程 1.把水煮沸、2.用沸水冲泡EE、3.把EE倒进杯子、4.加TT
	 */

	public final void create() {

		boilwater();//把水煮沸
		brew();//用沸水冲泡EE
		pourInCup();//把EE倒进杯子
		addCoundiments();//加..
		hook();
	}

	public void hook() {
		
	}

	/**
	 *加..
	 */
	public abstract void addCoundiments();

	private void pourInCup() {
		System.out.println("倒入杯中---------------");
		
	}

	/**
	 * 用沸水冲泡EE
	 */
	public  abstract void brew();

	public void boilwater() {
		System.out.println("把水煮沸---------------");
	}
}
