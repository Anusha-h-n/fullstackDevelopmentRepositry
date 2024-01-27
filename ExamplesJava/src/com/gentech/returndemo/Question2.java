package com.gentech.returndemo;
class demo1{
	double[] method (double x[]) {
		double a[]=new double[x.length];
		int k=0;
		for(int i=x.length/2;i<x.length;i++) {
			a[k]=x[i];
			k++;
				
		}
		return a;
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		demo1 o1=new demo1();
		
		double z[]={1.1,1.2,1.3,1.4};
		double k[]=o1.method(z);
		for(int i=0;i<z.length;i++) {
			System.out.print(k[i]+" ");
		}
	}

}
