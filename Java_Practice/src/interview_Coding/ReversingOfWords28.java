package interview_Coding;

import java.util.*;
public class ReversingOfWords28 {

	public static void main(String[] args) {
		        Scanner scr=new Scanner(System.in);
		        System.out.println("Enter your words"); // welcome to java vijay
		        //nextLine() reads the entire line of input entered by the user as a string.
		        String input=scr.nextLine();
		        String words[]=input.split(" "); 
        //Arrays.toString() it will print elements from the string in the form of array list 
		        System.out.println(Arrays.toString(words));  //  [welcome, to, java, vijay]
		        String rev_String="";
		        for(String each:words)
		        {
		            String rev_Word="";
		            for(int i=each.length()-1;i>=0;i--)
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
	


