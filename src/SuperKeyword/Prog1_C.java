package SuperKeyword;

public class Prog1_C extends Prog1_P {
	
	int a=30;
	int c=40;
public void show()
{
	System.out.println("Child class A =" + a);
	System.out.println("Parent class B =" + b);
	System.out.println("Parent class A =" + super.a);
	System.out.println("Child class c =" + c);
	System.out.println("Parent class c =" + super.c);
}

	
	
}
