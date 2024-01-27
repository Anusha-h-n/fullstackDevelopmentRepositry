package com.gentech.demo;

public class practice {

	public static void main(String[] args) {
	//3 for loop 1.to findout size,2.creating array 3.display array
		int size=0;
		for(int i=20;i<=40;i++) {
			if(i%2==0) {
				size++;
			}
		}
		System.out.println(size);
		int k=0;
		int a[]=new int[size];
		for(int j=20;j<=40;j++) {
			if(j%2==0) {
			a[k]=j;k++;
		}
		}	
		for(int z=a.length-1;z>=0;z--) {
			System.out.println(a[z]);
		}

	}

}
