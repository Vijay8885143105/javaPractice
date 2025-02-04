package interview_Coding;

public class Count_vowels31 {
    public static void main(String args[]) 
    {    
        String str = "mariajatrutha";
        String vowels = "";      
        String consonants = "";  
        int vowelCount = 0;                
        int consonantCount = 0;

        for (char var : str.toCharArray()) {
            if ("aeiou".indexOf(var) != -1) {  
                vowels =vowels+var;
                vowelCount++;                    
            } 
            else 
            {  
            	// If it's not a vowel, it must be a consonant
                consonants =consonants+var;
                consonantCount++;
            }
        }

        // Printing the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonants: " + consonants);
        System.out.println("Consonant Count: " + consonantCount);
    }
}
