package com.gentech.methods;
class Digits{
	void method(int x)
	{
		if(x>=0&&x<9)
		{
			System.out.println(x+"has 1 digit");
		}
		
			else if(x>=10&&x<99) 
			{
				System.out.println(x+" has 2 digits");

			}
			else {
				System.out.println("invalid");
			}
		}

	}

public class Question6 {

	public static void main(String[] args) {
      Digits o1=new Digits();
      o1.method(10);

	}

}
