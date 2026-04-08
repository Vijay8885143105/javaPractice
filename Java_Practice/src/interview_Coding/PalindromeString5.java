package interview_Coding;

import java.util.Scanner;

public class PalindromeString5 {

	public static void main(String[] args) {
		//A palindrome string is a string that reads the same backward as forward.
		//new is a keyword in Java used to create (instantiate) an object.
		Scanner scr=new Scanner(System.in);  //new Scanner(...) is the constructor of the Scanner class.
		System.out.println("Enter the string");
		String str=scr.next();
		String org_str=str; //This line stores the original string  in org_str  so that it can be used later for comparison.
		int len=str.length();

		String rev="";
		//This loop iterates from the end of the string to the beginning, 
		//appending each character to the rev string, effectively reversing the string.
		for (int i=len-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		//Check if the original string is equal to the reversed string
		if (org_str.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String"); 
		}
		scr.close();  //Close the scanner
	}
}
