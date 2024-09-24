package exceptionhandling2;

public class TryCatchBlock {
	public static void main(String[] args) {
		/*int a=100;
		System.out.println("Program is started");
		try 
		{
			System.out.println(a/0);
		} 
		catch (ArithmeticException e) {    //Type of exception
			System.out.println(e.getMessage());   //Detailed error message
		}
		{
			System.out.println("Program is in progress");
			System.out.println("Program is in exited");*/
		/*String ss=null;
			System.out.println("Program is started");
			try 
			{
				System.out.println(ss.length());
			} 
			catch (NullPointerException e1) 
			{
				System.out.println(e1.getMessage());   //Detailed error message
			} 
			{
				System.out.println("Program is in progress");
				System.out.println("Program is in exited");

		}*/
		/*	String sss="VijaySheri";
			System.out.println("Program is started");
			try 
			{
				int i=Integer.parseInt(sss);
			} 
			catch (NumberFormatException e2) 
			{
				System.out.println(e2.getMessage());   //Detailed error message
			} 
			{
				System.out.println("Program is in progress");
				System.out.println("Program is in exited");

		}*/
		int a[]=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		try
		{
			System.out.println(a[5]);
		} 
		catch (ArrayIndexOutOfBoundsException ee) 
		{
			System.out.println(ee.getMessage());
		}
	}
}


