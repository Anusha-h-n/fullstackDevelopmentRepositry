package com.gentech.returndemo;
class demo{
	int[] method (int x[]) {
		int a[]=new int[x.length];
		int k=0;
		for(int i=x.length-1;i>=0;i--) {
			a[k]=x[i];
			k++;
		}
		return a;
	}
}
public class Question1 {
	public static void main(String[] args) {
		demo o1=new demo();
		int b[] = {1,2,3,4};
		int res[] =o1.method(b);
		for(int i=0; i < b.length; i++)
			System.out.println(res[i]);
}
}