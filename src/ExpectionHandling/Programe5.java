package ExpectionHandling;

public class Programe5 {

	public static void main(String[] args)   {
		
		String str[] = {"A","B","C","D","E"};
		
		System.out.println("Main Programe is started");
         
		try	{
			System.out.println(str[4]);//n0 exception
			}
			catch(Exception	e)
			{
			System.out.println("Exception handled = " +e);
			}
			System.out.println("Program	finished");

		

	}

}
