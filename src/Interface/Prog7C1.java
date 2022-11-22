package Interface;

public class Prog7C1 implements Prog7P {

	@Override
	public void show1() {
		System.out.println("Override show1 in C1");
		
		
	}

	@Override
	public void show2() {
		System.out.println("Override show2 in C1");
		
	}

	@Override
	public void show3() {
		System.out.println("Override show3 in C1");
		
	}
	
	@Override //(Here,Class method override the interface method)
	public void show4()
	
//In this method we can write the programe in class then we call it on main 
//method.(eg. Green salad we pay for that)	
	
     {
	System.out.println("Override show4 in C1");	
	}
 
	//@Override (we can not use Override world here)
    public static void show5()
    {
    	System.out.println("Override show5 in C1");
    	
    }

}
