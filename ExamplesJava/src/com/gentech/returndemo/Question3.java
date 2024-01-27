package com.gentech.returndemo;

class Sum
{
	int sumArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
		}
		return sum;
	}
}

	
public class Question3 {
	public static void main(String[] args) {
		Sum s= new Sum();
		int ar[]= {1,2,3,4};
		int p=s.sumArray(ar);
		System.out.println(p);
		
		

	}


}
