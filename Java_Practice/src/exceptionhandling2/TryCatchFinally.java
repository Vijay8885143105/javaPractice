package exceptionhandling2;

public class TryCatchFinally {

	public static void main(String[] args) {
		//finally block will always execute
		/*	int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		try 
		{
			System.out.println(a[4]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block executes");
		}*/
		/*int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		try 
		{
			System.out.println(a[4]);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block executes");
		}*/
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		try 
		{
			System.out.println(a[3]);  //40
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block executes");
		}


	}

}
