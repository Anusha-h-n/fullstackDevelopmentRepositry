package com.gentech.returndemo;
class SumFirst
{
	int FirstRow(int arr[][])
	{
		int sum=0;	

		for(int j=0;j<arr[0].length;j++)
		{
			sum = sum+arr[0][j];
		}
		return sum;
	}
}

public class Question7 {
	public static void main(String[] args) {

		SumFirst s= new SumFirst();
		int sum1[][]={{1,2,3},{4,5,6},{7,8,9}}; 
		int p=s.FirstRow(sum1);
		System.out.println(p);


	}


}
