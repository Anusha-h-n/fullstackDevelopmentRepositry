package com.gentech.demo1;
class CapitalCity{
	CapitalCity(String name){
		System.out.println("name of City "+name);
		
	}
	CapitalCity(int population){
		System.out.println("number of wheels "+population);
	}
}
public class Question2 {

	public static void main(String[] args) {
		CapitalCity o1=new CapitalCity(100000);
		CapitalCity o2=new CapitalCity("delhi");
	}

}
