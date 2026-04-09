package interview_Coding;

public class Seperate_Characters35 {
    public static void main(String[] args) {
        String input = "sumitMT35";
        StringBuilder lowerCase = new StringBuilder();   //stringBuilder used to create and modify strings efficiently.
        StringBuilder upperCase = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) 
        {
            if (Character.isLowerCase(ch))   //Character is the wrapper class in java, provide methods to work with characters (char type)
            {
                lowerCase.append(ch);
            } 
            else if (Character.isUpperCase(ch))
            {
                upperCase.append(ch);
            } 
            else if (Character.isDigit(ch))
            {
                numbers.append(ch);
            }
        }

        // Output the results
        System.out.println(lowerCase.toString()); // sumit
        System.out.println(upperCase.toString()); // MT
        System.out.println(numbers.toString());   // 35
    }
}
