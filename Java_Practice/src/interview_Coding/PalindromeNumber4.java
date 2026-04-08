package interview_Coding;

import java.util.Scanner;

public class PalindromeNumber4 {

	public static void main(String[] args) {
		//A palindrome number is a number that remains the same when its digits are reversed.
		//new is a keyword in Java used to create (instantiate) an object.
		Scanner scr=new Scanner(System.in);   //new Scanner(...) is the constructor of the Scanner class.
		System.out.println("Enter a number");
		int num=scr.nextInt();
		int org_num=num;  //This line stores the original number in org_num so that it can be used later for comparison.
		//Using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;                         //num % 10 → gives the last digit
			num=num/10;                                       //Remove the last digit
		}
		if(org_num==rev)  //Check if the original number  is equal to the reversed number
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println(" Not Palindrome Number");

		}
	}

}
