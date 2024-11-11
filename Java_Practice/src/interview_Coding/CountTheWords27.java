package interview_Coding;

import java.util.Scanner;

public class CountTheWords27 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the words");
		String str=scr.nextLine();
		int count=0;
		for (int i = 0; i <str.length()-1;  i++) {
			if ((str.charAt(i)==' ')&&( str.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of word are::::::"+count);
	}
}
