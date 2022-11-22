package ThisPrograme;

public class Prog3 {
//3)It	is	also	used	when	we	want	to	call	
	//zero	parameter	constructor	of	its	own	class
 public Prog3()
 {
	
	 System.out.println("This is the non parameterized constrctor");
	 
 }
public Prog3(int a)
{
	this();//if we comment this world then zero parameter constructor haven't call
	System.out.println("This is parameterized constructor");
    System.out.println("Value of A =" + a);
}
//if we want to call zero parameter constructor then we type *this* keyword into
//Parameterized constructor

public static void main(String[] args)
{
	Prog3 z = new Prog3(100);
}













}








