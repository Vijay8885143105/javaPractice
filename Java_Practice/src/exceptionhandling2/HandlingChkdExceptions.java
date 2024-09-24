package exceptionhandling2;

public class HandlingChkdExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		try
		{
			Thread.sleep(4000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Program is finished");
		System.out.println("Program exited");

	}

}
