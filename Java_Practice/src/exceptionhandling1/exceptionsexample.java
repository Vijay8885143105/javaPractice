package exceptionhandling1;

public class exceptionsexample {

	public static void main(String[] args) {
		
		System.out.println("started");                //checked exception ::   Interrupted Exception at Run time
		//Thread.sleep(2000);          
		//We Can Handle  checked Exception with (throws keyword or try catch)
		System.out.println("stopped");
		
		int a=10;
		System.out.println(a/0);                          //Unchecked Exception::  Arithmetic Exception At Run time
		System.out.println("stopped");

	}

}
