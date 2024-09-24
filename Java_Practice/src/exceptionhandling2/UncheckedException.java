package exceptionhandling2;

public class UncheckedException {

	public static void main(String[] args) {
	/*	int a=100;
		System.out.println(a/0);  //ArithmeticException
		
		String s="12345678";
		int i=Integer.parseInt(s);
		System.out.println(s);   //12345678
		String s1="VijayPatel";
		int i1=Integer.parseInt(s1); //NumberFormatException
		
		String s2=null;
		System.out.println(s2.length()); //NullPointerException*/
		
		int a[]=new int[3];
		a[0]=12;
		a[1]=18;
		a[2]=14;
		a[3]=11;
		System.out.println(a[5]);  //ArrayIndexOutOfBoundsException	
	}

}
