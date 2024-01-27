package com.gentech.methods;
class Tables{
	void method1(int x) {
		int res=1;
		for(int i=1;i<=10;i++) {
			res=i*x;
			System.out.println(x+"*"+i+"="+res);
		}
		
		
	}
	
}

public class Question1 {

	public static void main(String[] args) {
		Tables o1=new Tables();
		o1.method1(10);

	}

}
