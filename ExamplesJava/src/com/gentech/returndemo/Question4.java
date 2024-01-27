package com.gentech.returndemo;
class demo3{
	int method(int x,int y) {
		int sum=0;
		if(x>y) {
			for(int i=y;i<=x;i++) {
				if(i%2==1) {
				sum=sum+i;
				}
				
			}
		}
		else {
			for(int i=x;i<=y;i++) {
				if(i%2==1) {
					sum=sum+i;
					}
			}
		}
		return sum;
	}
}
public class Question4 {

	public static void main(String[] args) {
		demo3 o1=new demo3();
		int sum=o1.method(1,20);
		System.out.println(sum);
		
	}

}
