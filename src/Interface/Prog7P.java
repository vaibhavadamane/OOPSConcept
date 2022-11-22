package Interface;

public interface Prog7P {

	public abstract void show1();
	abstract public void show2();
	void show3();
	
	public default void show4()
	
//Default is default if we can't write this method in class only we can
//call this in main method else it is printed.(eg.javnasaobat kanda,kakdi,
//cahtani,gajar ,salad we don't pay for that)
	
//This method is not compulsory to implement the implement class. else they should run
	
	
	{
		System.out.println("This is show4 in interface");
	}
	
	public static void show5()
// we must implement this method in implement the class	
     {
		System.out.println("This is show5 in interface");
		
	}
	
	}

//Java 7 :This version's interface is 100% abstrct we can't write a 
//defination in interface.

//java 8 :Here we can write the complete method in interface.



