package Packages1;

public class C extends A
{
	public void display3()
	{
//		System.out.println("A =" + a);//Here also we can't access the private
		System.out.println("B =" + b);
		System.out.println("C =" + c);
		System.out.println("D =" + d);
	}
	

}

//Note:-We can access all specifier in another class and sub class in same
//package except the private specifier.