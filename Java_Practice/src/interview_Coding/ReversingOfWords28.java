package interview_Coding;

import java.util.*;
public class ReversingOfWords28 {

	public static void main(String[] args) {
		        Scanner scr=new Scanner(System.in);
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

		        scr.close();
		    }
		}
	


