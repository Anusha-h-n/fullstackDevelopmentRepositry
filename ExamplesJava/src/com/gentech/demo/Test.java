package com.gentech.demo;
//1st row
public class Test {

	public static void main(String[] args) {
		String anu[][]= {{"anu","is","a"},{"anu","is","not"},{"a","good","girl"}};
		String sen=" ";
		for(int i=0;i<anu.length;i++) {
			for(int j=0;j<anu[i].length;j++) {
				sen=sen+anu[i][j];
				
			}
			
		}System.out.println(sen);
	}

}
