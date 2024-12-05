package interview_Coding;

import java.util.Scanner;

public class ReversingNumber2 {

	public static void main(String[] args) {
		//creates a Scanner object to read input from the user.
		Scanner scr=new Scanner(System.in);    //System.in is the argument
		System.out.println("Enter a number");
		//reads the integer entered by the user and stores it in the variable num.
		int num=scr.nextInt(); //It is used to read the next integer value from the input. 
		//By  using algorithm
		int rev=0;
		while (num!=0) {
			rev=rev*10 + num%10;  //extracts the last digit of num and appends it to rev.
			num=num/10;			      //removes the last digit from num
		}

		/*Using StringBuffer class
		 //Convert the number to a StringBuffer
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();        // Reverse the contents of the StringBuffer
		System.out.println(rev);*/

		/*Using stringBuilder Class
		 //creates a StringBuilder object sb1.
		StringBuilder sb1=new StringBuilder();
		//converts the integer num to a string and appends it to the StringBuilder object sb1.
		sb1.append(num);                        //append means in english ::::incude
		// Reverse the contents of the StringBuilder
		StringBuilder	rev1=sb1.reverse();
		System.out.println(rev1);	*/	
	}
}
