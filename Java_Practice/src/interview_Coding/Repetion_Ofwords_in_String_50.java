package interview_Coding;

import java.util.*;
public class Repetion_Ofwords_in_String_50{
    public static void main(String[] args)
    {
    	        // Input string                                 //28   50  use input
    	        String input = "This is a test. This test is simple and this test works.";

    	        // Convert the string to lowercase so that "This" and "this" are counted as the same word
    	        input = input.toLowerCase();

    	        // Remove punctuation using regex (only keep letters and spaces)
    	        input = input.replaceAll("[^a-z\\s]", "");

    	        // Split the string into words using space as a separator
    	        String words[] = input.split(" ");

    	        // Create a HashMap to store word counts
    	        HashMap<String, Integer> wordCount = new HashMap<>();

    	        // Loop through each word
    	        for (String word : words) 
    	        {
    	            if (!word.isEmpty()) // Check to avoid counting empty strings
    	            { 
    	                // If the word is already in the map, increase its count by 1
    	                if (wordCount.containsKey(word)) 
    	                {
    	                    wordCount.put(word, wordCount.get(word) + 1);
    	                } 
    	                else  	                
    	               {
    	                    // If the word is not in the map, add it with a count of 1
    	                    wordCount.put(word, 1);
    	                }
    	            }
    	        }

    	        // Print the word repetitions
    	        System.out.println("Word repetitions:");
    	        for (String word : wordCount.keySet()) 
    	        {
    	            System.out.println(word + ": " + wordCount.get(word));
    	        }     
    }
}