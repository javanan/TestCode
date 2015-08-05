package com.arithmetic.sort;

/**
 * 插入排序
 * @author chen
 *
 */
public class InsertionSort {

	public static Integer[] insertsortmethod(Integer[] in){
		int temp;
		for(int i=1;i<in.length;i++){
			for(int j=i-1;j>=0;j--){
				if(in[j]<in[j+1]){
					temp=in[j];
					in[j]=in[j+1];
					in[j+1]=temp;
				}
			}
		}
		return in;
	}
	
	
	
	
	public static void main(String[] args){
		Integer[] in={1,4,3,9,5,7,4,33,6,4,2,56,2};
		InsertionSort.insertsortmethod(in);
		for(Integer i:in){
			System.out.println(i+",");
		}
		
	}
}
