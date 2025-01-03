package interview_Coding;

import java.util.*;
class SumOfDigitsintheString33{
    public static void main(String[] args)
    {
        String str="pavan12345";
        int sum=0; //Initialize a variable to hold the sum of digits
        //Convert the string to a character array and iterate over each character
        for(char ch:str.toCharArray())
        {
        	//Check if the character is a digit
        	//Character is a wrapper class in Java that provides methods to work with characters (char type).
            if(Character.isDigit(ch))
            {
            	//If the character is a digit, convert it to its numeric value and add it to sum
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
