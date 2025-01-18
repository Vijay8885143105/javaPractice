package interview_Coding;

import java.util.*;
public class Count_Charctrs_in_String_45
{
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scr.nextLine();
		int count=0;
		for(char ch:str.toCharArray())
		{
			if(ch!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}