package com.gentech.methods;
class Array{
	void method() {
		char ch[][]= {{'a','b'},{'c','d'}};
		for(int i=ch.length-1;i>=0;i--) {
			for(int j=ch[i].length-1;j>=0;j--) {
				
				System.out.print(ch[i][j]);
			}
				System.out.println();
			
		}
	}
}
public class Question8 {

	public static void main(String[] args) {
		Array o1=new Array();
		o1.method();

	}

}
