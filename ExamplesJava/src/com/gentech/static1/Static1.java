package com.gentech.static1;
class Outer{
	class Inner{
		static String name;
		static String job;
	}
}
public class Static1 {

	public static void main(String[] args) {
		Outer.Inner.name="Anusha Bharadwaj";
		Outer.Inner.job="Developer";
		System.out.println(Outer.Inner.name);
		System.out.println(Outer.Inner.job);


	}

}
