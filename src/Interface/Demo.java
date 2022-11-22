package Interface;

import java.util.Scanner;

//Take a input form user......

public class Demo {

	public static void main(String[] args) 
	{
		int num1=0,num2=0;
		int sum=0;
		System.out.println("Enter the value of Num1 and Num2");
		Scanner a = new Scanner(System.in);
		num1 = a.nextInt();
		num2 = a.nextInt();
	    sum = num1 + num2;
	    
	    System.out.println("Addition of two number =" + sum);
	   

	}

}
