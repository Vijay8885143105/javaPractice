package interview_Coding;

public class Seperate_Characters35 {
    public static void main(String[] args) {
        String input = "sumitM28";
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        // Output the results
        System.out.println(lowerCase.toString()); // sumit
        System.out.println(upperCase.toString()); // M
        System.out.println(numbers.toString());   // 28
    }
}
