package ThisPrograme;

public class Prog2 {
// 2)	Whenever	 the	 name	 of	instance	 variable	 and	local	 variable	 are	 same	 then	 JVM	
//	confused	which	one	is	local	variable	and	which	is	instance	variable	so	to	avoid	this	
//	we	should	used	this	keyword
	
	int num1 = 1000;
	
	public Prog2(int num1)// num1=2000,this is parameterized constructor
	{ 
	  System.out.println("Value of local variable = " + num1);//local variable
	  System.out.println("Value of golabal variable = " + this.num1);//Global variable
	}
	public void showNum1Value()//non static method with no parameter
	{
		int num1 = 2000;
		System.out.println("Value of local variable = " + num1);
	    System.out.println("Value of gobal variable = " + this.num1);
	}
	public void showNum1ValueWithParameter(int num1)//num1=2000, this non static method with parameter
	{
		System.out.println("Value of local variable = " + num1);
		System.out.println("Value of gobal variable = " + this.num1);
	}
    public static void main(String[] args)
	{
	Prog2 x = new Prog2(2000);
    x.showNum1Value();
    x.showNum1ValueWithParameter(2000);
	}
}

	
	
	
	
	
	
	
	
	
	
	

