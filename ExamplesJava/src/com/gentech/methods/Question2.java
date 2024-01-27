package com.gentech.methods;
class Prime{
	void method1(int x)
	{
		int a=0;
		for(int j=2;j<x;j++) 
		{
			if(x%j==0) 
			{
				a=a+1;
				break;
			}
			
		}
		if(a==0) 
		{
			System.out.println(x+" is prime number");
		}
		else {
			System.out.println(x+" not prime");
		}
	}
}
public class Question2 {

	public static void main(String[] args) {
		Prime obj1=new Prime();
		obj1.method1(19);
	}
}
