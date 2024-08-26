package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Programme is strated");
		/*int a=20;
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());                         // ArithmeticException
		}

		String strr=null;
		try {
			System.out.println(strr.length());
		}
	catch(NullPointerException  s)                                          // NullPointerException
		{
		System.out.println(s.getMessage());
		}

			String st="aghfd";
			int e=Integer.parseInt(st);
			try {
			System.out.println(e);
			}
			catch(NumberFormatException d) {                       // NumberFormatException
			System.out.println(d.getMessage());
			}*/

		int array[]=new int[8];
		try
		{
			array[9]=234;
		}catch(ArrayIndexOutOfBoundsException c) {             // ArrayIndexOutOfBoundsException 
			System.out.println(c.getMessage());
		}
		System.out.println("Programme is in progress");
		System.out.println("Programme is in Complted");

	}
}


