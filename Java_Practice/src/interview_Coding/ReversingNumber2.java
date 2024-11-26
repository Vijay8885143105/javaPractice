package interview_Coding;

import java.util.Scanner;

public class ReversingNumber2 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);    //System.in is the argument
		System.out.println("Enter a number");
		int num=scr.nextInt(); //It is used to read the next integer value from the input. 
		//By  using algorithm
		int rev=0;
		while (num!=0) {
			rev=rev*10 + num%10;
			num=num/10;			
		}

		/*Using StringBuffer class
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);*/

		/*Using stringBuilder Class
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);                        //append means in english ::::incude
		StringBuilder	rev1=sb1.reverse();
		System.out.println(rev1);	*/	
	}
}
