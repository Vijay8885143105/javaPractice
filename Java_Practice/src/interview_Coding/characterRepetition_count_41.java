package interview_Coding;

public class characterRepetition_count_41 {
    public static void main(String[] args) {
        String str = "I love my india";
        int[] char_count = new int[256]; // Assuming ASCII characters

        // Count each character in the string
        for (char c:str.toCharArray()) {
            char_count[c]++;
        }

        // Print the character and its count
        for (int i = 0; i < char_count.length-1; i++) {
            if (char_count[i] > 0) {
                System.out.println((char)i + " : " + char_count[i]);
            }
        }
    }
}
