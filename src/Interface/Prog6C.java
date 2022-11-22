package Interface;

//Here we can implement two super class method in one sub class by using interface

public class Prog6C implements Prog6P2,Prog6P1 {

	@Override
	public void studentName() 
	{
		System.out.println("Student Name is Vaibhav");
		
	}

	@Override
	public void studentMoblieNo() 
	{
		System.out.println("Student Moblie No is 8975688065");
		
	}

	@Override
	public void studentRollNo()
	{
		System.out.println("Student Roll No is 10");
		
	}

	@Override
	public void studentDivision()
	{
		System.out.println("student Division is A");
		
	}

}
