package interview_Coding;


public class Specify_Class_46 {
    public static void main(String[] args) {
        String word = "specify";

        // Loop through the string and print substrings
        //The program prints all suffixes of the word “specify”.
       // Each new line starts one character later in the word.
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i));
        }
    }
}