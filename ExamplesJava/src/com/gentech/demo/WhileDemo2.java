package com.gentech.demo;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i=10;
		while(i<=20) {
			i++;
		
			if(i%2==0) {
				continue;
			}
			
			System.out.println(i);
			
			
		}

			
			
		
	}

}
