package ExpectionHandling;

public class Programe1 {

	public static void main(String[] args) 
	{
		int a=10,b=0;
		System.out.println("This is start of Program");
		
		try {
		System.out.println(a/b);//infinity
		}
		catch(Exception abc) 
		{
			   System.out.println("Exception is occured and handled = " +abc);
		}
		System.out.println("This is end of Program");

	
	}	
}
