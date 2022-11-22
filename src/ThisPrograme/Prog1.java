package ThisPrograme;
//uses of *this* keyword
public class Prog1 {
//1)This keyword refer to current object inside the method or constructor...
//The value of this keyword and the value of object are same
//because this keyword refer the value of object of the class
	public void showThisValue()
	{
		System.out.println(this);
     }

	public static void main(String[] args) 
	{
		Prog1 a = new Prog1();
		System.out.println(a);//object value
		a.showThisValue();//this keyword value
		
		Prog1 b = new Prog1();
		System.out.println(b);
		b.showThisValue();
	}






}
