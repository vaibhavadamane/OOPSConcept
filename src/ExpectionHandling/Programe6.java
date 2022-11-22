package ExpectionHandling;

//Multipal Try Catch Programe

public class Programe6 {

	public static void main(String[] args) {
		
    System.out.println("Programe is started");
    try {
    	System.out.println(10/0);
    	}
    catch(ArithmeticException e)
    {
    	System.out.println("We can't divded any number by zero = " +e);
    }
    System.out.println("Programe is ended");
    
    System.out.println("*************");
    
    System.out.println("Programe is started");
    
    String set =null;
    try {
    System.out.println(set.toUpperCase());
    }
    catch(NullPointerException e1) 
    {
    	System.out.println("We can't do that this opertion becoz haven't setatement = " +e1);
    }
    System.out.println("Programe is ended");
    
	}
	

}
