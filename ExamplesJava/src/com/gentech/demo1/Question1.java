package com.gentech.demo1;
class Vehicle{
	Vehicle(String name){
		System.out.println("name of the vehicle "+name);
		
	}
	Vehicle(int wheels){
		System.out.println("number of wheels "+wheels);
	}
}
public class Question1 {

	public static void main(String[] args) {
		Vehicle o1=new Vehicle("car");
		Vehicle o2=new Vehicle(4);

	}

}

