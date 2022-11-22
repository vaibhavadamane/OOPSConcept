package ExpectionHandling;
//Cases programe...........Use of Finally Block
public class Programe4 {

	public static void main(String[] args) {
		
		try {
	     System.out.println("Statement1");
	     System.out.println("Statement2 =" +10/0);
		 System.out.println("Statement3");
		}
		catch(Exception x)
		{
	    System.out.println(20/0);
		System.out.println("Statement4");
			
		}
        finally 
        {
        System.out.println(40/0);
        System.out.println("Statement5");	
        }
	    System.out.println("Statement6");
	    
//Case 1 : No exception	=> 1 2 3 5 6 (normal execution)
//Case 2 : Exception at	2 and match	with catch => 1	4 5	6 (normal execution)
//Case 3 : Exception at	2 and not match	with catch	=> 1 5 (abnormal termination)
//Case 4 : Exception at 2 and even in catch	=> 1 5 (abnormal termination)
//Case 5 : Exception at	2 and even in finally => 1 (abnormal termination)
	    
	    
	    
	    
	    
	}

}
