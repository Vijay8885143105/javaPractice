package interview_Coding;

import java.util.*;
class SumOfDigitsintheString33{
    public static void main(String[] args)
    {
        String str="pavan12345";
        int sum=0;
        for(char ch:str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
