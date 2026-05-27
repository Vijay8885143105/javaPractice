package interview_Coding;

import java.util.*;
public class Count_Charctrs_in_String_45
{
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scr.nextLine();
		int count=0;                                        //Stores number of characters (excluding spaces)
		for(char ch:str.toCharArray())     //Converts string to character array and iterate over each character
		{
			if(ch!=' ')
			{
				count++;                                       //Increases count for every valid character
			}
		}
		System.out.println(count);
	}
}