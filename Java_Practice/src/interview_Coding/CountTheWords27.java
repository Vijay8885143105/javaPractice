package interview_Coding;

import java.util.Scanner;

public class CountTheWords27 {

	public static void main(String[] args) {
		//initializes a Scanner object to read input from the console.
		//System.in is used as the input stream for the Scanner
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the words");
		//reads the entire line of input from the user.
		String str=scr.nextLine();
		//int count = 1; initializes the word count to 1 (**assuming the string is non-empty**).
		int count=1;
		//Loop through each character of the string except the last one
		for (int i = 0; i <str.length()-1;  i++) {
			//Checks if the current character is a space and the next character is not a space
			if ((str.charAt(i)==' ')&&( str.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of word are::::::"+count);
	}
}
