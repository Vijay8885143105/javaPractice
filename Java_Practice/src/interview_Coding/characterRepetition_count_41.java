package interview_Coding;

public class characterRepetition_count_41 {
    public static void main(String[] args) {
        String str = "I love my india";
        int[] char_count = new int[256]; // Assuming ASCII characters , 256 is the ASCI character set

        // Count each character in the string
        for (char c:str.toCharArray()) {
            char_count[c]++;   //Increments the count for that character.
        }

        // Print the character and its count
        //Loops through the entire char_count array from index 0 to 254.
        //char_count.length is 256.
        for (int i = 0; i < char_count.length-1; i++) {    
            if (char_count[i] > 0) {
                System.out.println((char)i + " : " + char_count[i]);
            }
        }
    }
}
