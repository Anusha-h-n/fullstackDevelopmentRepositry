package com.gentech.demo1;
class Insurance{
	Insurance(String name){
		this(1);
		System.out.println("name of Insurance "+name);
	}
	Insurance(int duration){
		System.out.println("duration "+duration+" years");
	}
}
public class Question7 {

	public static void main(String[] args) {
		Insurance o1=new Insurance("jeevanjyothi");

	}

}
