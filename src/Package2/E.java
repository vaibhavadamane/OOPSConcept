package Package2;

import Packages1.A;  //when we mouse over on A that time package will import

public class E {
	
	public void display1()
	
	{
		System.out.println("A =" + A.a);//Public
		System.out.println("B =" + A.b);//Protected
		System.out.println("C =" + A.c);//Private
		System.out.println("D =" + A.d);//default
		}
}
//Note:- here we can not access the protected specifier because we not use
//inheritances so we say that one think we can access *public* specifier
//all over the program