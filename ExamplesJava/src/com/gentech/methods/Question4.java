package com.gentech.methods;

class Demo
{ 
 void method() {
	 int count=0;
	 for(int i=50;i<=100;i++) {
		 int a=0;
		
		 for(int j=2;j<i;j++) {
			 if(i%j==0) {
				 a++;
				 break;
			 }
		 }
		 if(a==0) {
			count++; 
		 }
	 }
	 System.out.println(count);
 }
	
}
public class Question4 {

	public static void main(String[] args) {
	Demo o1=new Demo();
	o1.method();
	}

}
