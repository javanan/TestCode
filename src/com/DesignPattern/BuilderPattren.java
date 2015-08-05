package com.DesignPattern;

import org.junit.Test;

public class BuilderPattren {
	private final int a;
	private final int b;
	private final int c;
	private final int d;
	
	
	//final 修饰的变量 要么初始化，要么在构造函数中赋值
	private BuilderPattren(Builder builder){
		a=builder.a;
		b=builder.b;
		c=builder.c;
		d=builder.d;
	}


	
	public static class Builder{
		//required parameters
		private  final int a;
		private  final int b;
		
		//optional parameters - initialized to default values
		private int c=0;
		private int d=0;
		
		public Builder(int a, int b){
			this.a=a;
			this.b=b;
		}
		
		public Builder c(int c){
			this.c=c;
			return this;
		}
		
		public Builder d(int d){
			this.d=d;
			return this;
		}
		
		public BuilderPattren build(){
			return new BuilderPattren(this);
		}
		
		

	}

	
	
	//客户端代码
	@Test
	public void  instal(){
		BuilderPattren a= new BuilderPattren.Builder(10, 6).d(3).build();
		
	}
}
