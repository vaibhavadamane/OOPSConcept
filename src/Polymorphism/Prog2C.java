package Polymorphism;

public class Prog2C extends Prog2P
{
	@Override
public void print()
{
	
	System.out.println("This is the print method for child");
	
}
/*Note:- here the child method is override the parent method
when the name of super class and sub class is same then jvm is execute the child
Method at run time except parent method so we used @Override world before the
child method.*/
}
