package com.gentech.demo1;
class SoftwareTools{
	SoftwareTools(String name){
		System.out.println("name of the tools:"+name);
		
	}
	SoftwareTools(int wheels){
		System.out.println("number of wheels "+wheels);
	}
}
public class Question4 {

	public static void main(String[] args) {
		SoftwareTools o1=new SoftwareTools("jdm");
		SoftwareTools o2=new SoftwareTools(4);

	}

}
