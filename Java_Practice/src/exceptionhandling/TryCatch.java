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

		String str=null;
		try {
			System.out.println(str.length());
		}
	catch(NullPointerException  g)                                          // NullPointerException
		{
		System.out.println(g.getMessage());
		}

			String st="aghfd";
			int intk=Integer.parseInt(st);
			try {
			System.out.println(intk);
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


