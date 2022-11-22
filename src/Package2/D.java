package Package2;

import Packages1.A;  //(when we click on A the import package A option is created)

public class D extends A {
	
	public void display4()
	{
		System.out.println("A =" + a);//Private
		System.out.println("B =" + b);//default
		System.out.println("C =" + c);
		System.out.println("D =" + d);
	}
}
//Note:-We can not access the default because its scope of this member is 
//Remain into package not for outside the package 
//here protected is also same for default but in inheritance use we can access
//its into another package