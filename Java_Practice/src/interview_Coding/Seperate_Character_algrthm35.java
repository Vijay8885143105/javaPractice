package interview_Coding;
public class Seperate_Character_algrthm35 {
    public static void main(String[] args) {
        String input = "sumitM28";
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check for lowercase letters (a-z)
            if (ch >= 'a' && ch <= 'z') {
                lowerCase.append(ch);
            }
            // Check for uppercase letters (A-Z)
            else if (ch >= 'A' && ch <= 'Z') {
                upperCase.append(ch);
            }
            // Check for digits (0-9)
            else if (ch >= '0' && ch <= '9') {
                numbers.append(ch);
            }
        }

        // Output the results
        System.out.println(lowerCase.toString()); // sumit
        System.out.println(upperCase.toString()); // M
        System.out.println(numbers.toString());   // 28
    }
}