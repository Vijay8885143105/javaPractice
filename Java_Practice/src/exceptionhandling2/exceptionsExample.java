package exceptionhandling2;

public class exceptionsExample {

	public static void main(String[] args) {
		System.out.println("Started");
		//Thread.sleep(3000);     //interruptedException
		//We can handle above exception with try-catch block (or) throws keyword
		System.out.println("Stopped");
		int a=100;
		System.out.println(a/0);   //ArithmeticException

	}

}
