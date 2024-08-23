package exceptionhandling;

public class exceptionsexample {

	public static void main(String[] args) {
		
		System.out.println("started");
		//Thread.sleep(2000);          checked exception ::   Interrupted Exception at Run time
		System.out.println("stopped");
		int a=10;
		System.out.println(a/0); //Unchecked Exception::  Arithmetic Exception At Run time
	}

}
