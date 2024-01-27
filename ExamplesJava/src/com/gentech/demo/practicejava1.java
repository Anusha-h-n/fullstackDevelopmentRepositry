package com.gentech.demo;

public class practicejava1 {

	public static void main(String[] args) {
		int size=0;
		for(int i=51;i<=71;i++) {
			if(i%2==1) {
				size++;
			}
		}System.out.println("size is:"+size);
		int a[]=new int[size];
		int k=0;
		int sum=0;
		for(int j=51;j<=71;j++) {
			if(j%2==1) {
				a[k]=j;
				k++;
				sum=sum+j;
			}
		}
		for(int z=(a.length/2)-1;z<a.length;z++) {
			System.out.println(a[z]);
		}
		System.out.println(sum);

	}

}
