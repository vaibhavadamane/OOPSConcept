package ExpectionHandling;
//Multipal catch block.....
public class Programe7 {

	public static void main(String[] args) {
		 
		System.out.println("Programe is started");
		try {
		System.out.println(10/0);
		}
		catch(NullPointerException e) 
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
		}
//		catch(ArithmeticException e3)
//		{
//			System.out.println(e3);
//		}
		catch(Throwable e4)
		{
			System.out.println(e4);
		}
		
	}

}
