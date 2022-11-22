package Interface;

import java.util.Scanner;

public class Prog1C implements Prog1P {

	String Name;
	int empId;
	double salary;
	
	@Override
	public void getEmpDetails() 
	{
		System.out.println("Enter Name,Emp Id,Emp Salary");
		Scanner	a = new	Scanner(System.in);
		Name = a.next();
		empId = a.nextInt();
		salary = a.nextDouble();
		}

	@Override
	public void showEmpDetails() {
		System.out.println("Name of the Empolyee =" + Name);
		System.out.println("Empolyee Id =" + empId);
		System.out.println("Salary of the Empolyee =" + salary);
	}

}
