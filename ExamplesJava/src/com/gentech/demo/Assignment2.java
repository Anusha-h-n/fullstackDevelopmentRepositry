package com.gentech.demo;

public class Assignment2 {

	public static void main(String[] args) {
		int i=25;
		int j=21;
		int k=44;
		if((i>=j) && (i>=k)) 
		{
			System.out.println(i+" is a largest number");
		}
		else if((j>=i) && (j>=k)) 
		{
			System.out.println(j+" is a largest number");
		}
		else 
		{
			System.out.println(k+" is a largest number");
		}
	}
}
