package com.gentech.methods;
class sub{
	void method() {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,4,4},{1,1,4}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				int res=a[i][j]-b[i][j];
				System.out.print(res+" ");
			}System.out.println();
		}
	}
}
public class Question7 {

	public static void main(String[] args) {
	  sub o1=new sub();
	  o1.method();

	}

}
