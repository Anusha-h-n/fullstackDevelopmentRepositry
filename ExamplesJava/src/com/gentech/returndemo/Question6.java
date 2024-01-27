package com.gentech.returndemo;

class Matrix
{
	int[] matrix1(int x[][])
	{
		int a[] = new int[x[0].length];
		int k=0;
		
		for(int i=0;i<x.length;i++)
		{
			a[k]=x[i][0];
			k++;
		}
		return a;
	}
}


public class Question6 {
	public static void main(String[] args) {
		Matrix m= new Matrix();
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int ab[]=m.matrix1(array);
		for(int i=0;i<array.length;i++)
		{
		System.out.println(ab[i]);	
		}
	}

}
