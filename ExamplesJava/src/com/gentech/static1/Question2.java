package com.gentech.static1;
class Outer1{
	Inner1 o1=new Inner1();
	class Inner1{
		private String name;
		private String job;
		public void setName(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		public void setJob(String job) {
			this.job=job;
		}
		public String getJob() {
			return job;
		}
	}
}
public class Question2 {

	public static void main(String[] args) {
		Outer1 obj=new Outer1();
		obj.o1.setName("Anusha Bharadwaj");
		String a=obj.o1.getname();
		System.out.println(a);
		obj.o1.setJob("Developer");
		String b=obj.o1.getJob();
		System.out.println(b);
		

	}

}
