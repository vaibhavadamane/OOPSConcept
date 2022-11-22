package Polymorphism;

//1) Compile time polymorphism :-

public class Prog1P {

// Method overloading :-
// When a class contain more than one method with same name and different argument/parameter/inputs is called as method overloading.
	
	public void add()
	{
		System.out.println("Addition1 =" + (10+20));
	}
    public void add(int a)
    {
    	System.out.println("Addition2 =" + (a+a));
    }
    public void add(double b)
    {
    	System.out.println("Addition3 =" + (b+b));
    }
    public void add(int num1,int num2)
    {
    	System.out.println("Addtion4 =" + (num1+num2));
    }
    public void add(double b,double c)
    {
    	System.out.println("Addition5 =" + (b+c));
    }
    public void add(double b,double c,double d)	
    {
    System.out.println("Addition6 =" + (b+c+d));	
    }
}
