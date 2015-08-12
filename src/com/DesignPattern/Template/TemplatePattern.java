package com.DesignPattern.Template;

public class TemplatePattern {
/*	关于模板模式
	 
	1>模板模式定义了算法的步骤，把这些步骤的实现延迟到子类
	2>模板模式为我们提供了一个代码复用的技巧
	3>模板抽象类中可以定义具体方法、抽象方法和钩子方法
	4>为了防止子类改变模板中的算法，可以将模板方法声明为final
	5>钩子是一种方法，它在抽象类中不做事，或只做默认的事，子类可以选择要不要实现它*/
	
	
/*	hook实现：
	1》存在一个空实现的方法，我们称这种方法为”hook”。子类可以视情况来决定是否要覆盖它。
	2》hook设置为boolean类型，在template中设置某些方法到 hook返回true才执行。
	父类默认hook返回true，  子类如果不要改方法执行，可以覆盖hook返回false.
	*/
}
