package interview_Coding;

public class SplitMethod_43 {
    public static void main(String[] args) {
        String str = "I love swetha";
        
        // Split the string into words
        String words[] = str.split(" ");
        
        // Print the word "swetha"
        // Assuming we know "swetha" is the 3rd word (index 2)
        System.out.println(words[2]);
    }
}
