package Packages1;

//Access Specifier/Modifier:-

public class A {
	
 //  In Same class.... as well as In Different class (Sub class) inheritance is performed
	
	private static int a=10;
    static int b=20;           // Here default word is all ready present here
	protected static int c=30;
	public static int d=40; 
	
	public void display1()
	{
		System.out.println("A =" + a);
		System.out.println("B =" + b);
		System.out.println("C =" + c);
		System.out.println("D =" + d);
	}
   
}
	
/*
Sr.No                                     Private Public Protected Default
1     Same	Class                            YES    YES     YES      YES
2     Sub class in same package               NO    YES     YES      YES
3     Non sub class in same package           NO    YES     YES      YES
4     Sub class	in another package            NO    YES     YES       NO
5     Non sub class in another package        NO    YES      NO       NO  */

	
	
	

