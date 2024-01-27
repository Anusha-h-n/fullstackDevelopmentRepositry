package com.gentech.demo1;
class Patient{
	Patient(String name){
		this(23);
		System.out.println("name of Patient "+name);
	}
	Patient(int age){
		System.out.println("age "+age);
	}
}
public class Question6 {

	public static void main(String[] args) {
		Patient o1=new Patient("anu");

	}

}
