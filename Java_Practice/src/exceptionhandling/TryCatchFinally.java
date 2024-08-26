package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a[]=new int[6];
		try 
		{
			a[8]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is the final block");
		}
	}

}
