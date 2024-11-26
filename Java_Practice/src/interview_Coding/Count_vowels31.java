package interview_Coding;

import java.util.Arrays;

public class Count_vowels31 {
    public static void main(String[] args) {
        String str = "mariajatrutha";
        char char_array[]=str.toCharArray();
        System.out.println(char_array);
        int vowelCount = 0;

        // Count the total number of vowels
        for (char var: str.toCharArray()) 
        {
            if ("aeiou".indexOf(var) != -1) 
            {
                vowelCount++;
            }
        }

        // Print the total number of vowels
        System.out.println("Total number of vowels: " + vowelCount);
    }
}

