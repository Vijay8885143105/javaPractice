package interview_Coding;

import java.util.*;

public class AnagramsCheck_51
{
	//Anagram means rearranging characters to form a new word.
	//If two strings can be rearranged to look the same, they are anagrams.
    public static void main(String[] args) 
    {
        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to lower case and remove spaces
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert to char array
        char a1[] = str1.toCharArray();
        char a2[]= str2.toCharArray();

        // sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Check equality
        if (Arrays.equals(a1, a2)) 
        {
            System.out.println("Both strings are Anagrams");
        } 
        else 
        {
            System.out.println("Strings are not Anagrams");
        }
    }
}
