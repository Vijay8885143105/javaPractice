package Interview_Coding;

import java.util.Scanner;

public class PalindromeString5 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scr.next();
		String org_str=str;
		int len=str.length();

		String rev="";
		for (int i=len-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String"); 
		}
	}
}
