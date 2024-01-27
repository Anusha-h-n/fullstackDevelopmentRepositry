package com.gentech.demo;

public class Assignment8 {

	public static void main(String[] args) {
		int a=23;
		if((a>=0)&&(a<9)){
			System.out.println(a+" is a 1 digit number");
		}
		else if((a>=10)&&(a<99)){
			System.out.println(a+" is a 2 digit number");
		}
		else if((a>=100)&&(a<999)){
			System.out.println(a+" is a 3 digit number");
		}
		else if((a>=1000)&&(a<9999)){
			System.out.println(a+" is a 4 digit number");
		}
		else {
			System.out.println("invalid");
		}



	
	}

}
