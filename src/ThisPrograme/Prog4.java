package ThisPrograme;

public class Prog4 {
//4)It	is	also	used	to	call	parameterized	constructor	of	
//	its	own	class.
  
	public Prog4()
{
		this(10);//if we comment this world then we haven't call the parameterized constrctor
		System.out.println("This is zero constrctor");
}
  public Prog4(int a)
  {
	  System.out.println("This is parameterized constrctor");
      System.out.println("Value of A =" + a);
  
 }
  public static void main(String[] args)
  {
	Prog4 y = new Prog4();
}




}
