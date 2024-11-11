package interview_Coding;

import java.util.Scanner;

public class PalindromeNumber4 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scr.nextInt();
		int org_num=num;
		//Using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Polindrome Number");
		}
		else
		{
			System.out.println(" Not Polindrome Number");

		}
	}

}
