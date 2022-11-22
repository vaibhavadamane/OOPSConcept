package Packages1;

public class B {
	public void display2()
	{
		System.out.println("A =" + A.a);//We can't access private outside the class
		System.out.println("B =" + A.b);
		System.out.println("C =" + A.c);
		System.out.println("D =" + A.d);
	}
   }
