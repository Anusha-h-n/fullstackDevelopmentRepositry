package com.gentech.demo1;
class Animals{
	Animals(String name){
		System.out.println("name of Animal "+name);
		
	}
	Animals(int legs){
		System.out.println("number of legs "+legs);
	}
}
public class Question3 {

	public static void main(String[] args) {
		Animals o1=new Animals("lion");
		Animals o2=new Animals(4);

	}

}
