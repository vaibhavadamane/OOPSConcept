package ExpectionHandling;

public class Programe3 {

	public static void main(String[] args)   {
		System.out.println("Hi,Good Morning !");
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("How are you?");
         
	}

}
