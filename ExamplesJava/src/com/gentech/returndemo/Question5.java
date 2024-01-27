package com.gentech.returndemo;
class demos{
	
		int [] method()
		{
			int k=0;
			int res[]= new int[10];
			for(int i=1;i<=10;i++)
			{
				res[k]= i*i*i;
				k++;
			}
			return res;
		}

		
			
	
	
}
public class Question5 {

	public static void main(String[] args) {
		demos c= new demos();
		int m[]=c.method();
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}

	}

	}


