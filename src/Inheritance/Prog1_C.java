package Inheritance;

public class Prog1_C extends Prog1_P{
	public void childMethod()
	 {
		 System.out.println("This is Child method");
	 }
	public void bike()
	{
	System.out.println("Child have bike");
	}
	public static void main(String[] args) 
	{
//		Prog1_P z = new Prog1_P();
//		z.parents();
//		z.car();
//		z.money();
	
//		Prog1_C x = new Prog1_C();
//		x.child();
//		x.bike();
//		The following are regular method 
		
//		we use single object when extends world this is known as inheritances

	   Prog1_C x = new Prog1_C();
	   x.parentsMethod();
	   x.car();
	   x.money();
	   x.childMethod();
	   x.bike();


	}


	}


