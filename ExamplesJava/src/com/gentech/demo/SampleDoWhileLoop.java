package com.gentech.demo;

public class SampleDoWhileLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			int j=1;
			do {
				System.out.print("# ");
				j++;

			}while(j<=5);

			System.out.println();
			i++;
		}while(i<=4);

	}
}
