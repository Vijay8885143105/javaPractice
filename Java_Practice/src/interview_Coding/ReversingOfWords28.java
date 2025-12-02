package interview_Coding;

import java.util.*;
public class ReversingOfWords28 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);         //28 50
		System.out.println("Enter your words"); // welcome to java vijay
		//nextLine() reads the entire line of input entered by the user as a string.
		String input=scr.nextLine();
		//Split the input string into an array of words
		String words[]=input.split(" "); 
		//Arrays.toString() it will print elements from the string in the form of array list 
		System.out.println(Arrays.toString(words));  //  [welcome, to, java, vijay]
		//Initialize an empty string to hold the final reversed string:
		String rev_String="";
		//Loop through each word in the array:
		for(String each:words)
		{
			String rev_Word="";//Initialize an empty string to hold the reversed word:
			for(int i=each.length()-1;i>=0;i--)//Reverse each word by iterating over its characters from end to beginning:
			{
				// appends each character to rev_word in reverse order.
				rev_Word	=rev_Word+each.charAt(i);
			}
			// appends the reversed word to the final string rev_str with a space.
			rev_String=rev_String+rev_Word+" ";
		}
		System.out.println(rev_String); //emoclew ot avaj yajiv 

		/* Scanner scr = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = scr.nextLine();
           String str1="automation";
        String rev_str = "";
        String words[] = str.split(" ");

        for (String each : words)
        {
            String rev_word = each;

            // Reverse only the word "automation"                 //If the our input is:::: welcome automation testing
            if (each.equalsIgnoreCase("automation"))
            {
                rev_word = "";
                for (int i = each.length() - 1; i >= 0; i--)
                {
                    rev_word = rev_word + each.charAt(i);
                }
            }

            rev_str = rev_str + rev_word + " ";
        }

        System.out.println(rev_str);*/
	}
}



