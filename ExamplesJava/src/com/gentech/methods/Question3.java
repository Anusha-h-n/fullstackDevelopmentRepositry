package com.gentech.methods;
class Prime1{
	void method() {
		
		for(int i=1;i<=50;i++) 
		{
			int a=0;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					a=a+1;
					break;
				}
				
			}
			if(a==0) 
			{
				System.out.println(i);
			}
		}
		
	}
}
public class Question3 {

	public static void main(String[] args) {
		Prime1 obj1=new Prime1();
		obj1.method();
	}
}
