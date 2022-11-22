package Enacapsulation;

public class EnacapsulationP {
 //Enacapsulation :- it is mechanism where we can wrap (combine) the data member and 
//member method in single unit (class)
//Note:-declare class member as private and method should be public
	
	private int empId = 100;
	private String name = "Vaibhav";
	private double salary = 10000.00;
	  
	public void empInfo()
	{
		System.out.println("Employee Id =" + empId);
		System.out.println("Empolyee Name =" + name);
		System.out.println("Empolyee salary =" + salary);
	}
//Here we can store data as private and method should be private in that place
//we excess thid data
	
}
