package com.gentech.methods;
class Sum{
	void method() {
		int sums=0;
		for(int i=1;i<=100;i++) {
			int a=0;

			for(int j=2;j<i;j++) {
				if(i%j==0) {
					a++;
					break;
				}
			}
			if(a==0) {
				sums=sums+i; 
			}

		}
		System.out.println(sums);

	}
}
public class Question5 {

	public static void main(String[] args) {
		Sum o1=new Sum();
		o1.method();

	}

}
