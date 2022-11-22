package Interface;

public class Prog4C implements Prog4P2,Prog4P1
{

	@Override
	public void add() {
		System.out.println("This is add method of interface 1");
		
		
	}

	@Override
	public void sub() {
		System.out.println("This is sub method of interface 2");
		
	}

}
