package com.gentech.demo1;
class Hospital{
	Hospital(String name){
		this(23);
		System.out.println("name of hospital "+name);
	}
	Hospital(int numberofdoctors){
		System.out.println("number of doctors "+numberofdoctors);
	}
}
public class Question5 {

	public static void main(String[] args) {
		Hospital o1=new Hospital("jyothi");

	}

}
