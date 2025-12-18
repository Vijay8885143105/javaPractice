package interview_Coding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtpFetchingFrmStrng_57 {

	public static void main(String[] args)
	{
		//import java.util.regex.*;     Import in the java online compiler
		
		//Pattern is a class in Java used to define a regular expression.
		//Matcher is a class in Java used to apply the Pattern on a given string.
		//Pattern defines the OTP format, Matcher scans the string, find() locates the match, and group() returns the extracted OTP.
		
		String str = "hello masti 143vijii56 and graduate from bits765";
		//One or more digits (143)  , One or more letters (vijii) , One or more digits (56)  , So it matches:::numbers + letters + numbers
        Pattern p = Pattern.compile("\\d+[a-zA-Z]+\\d+");       //This line defines what OTP looks like.
        Matcher m = p.matcher(str);                                                 // Small m      //Create Matcher Object, Matcher scans the string

        if (m.find()) {                                                                               //checks whether the pattern exists  //Search this string using this pattern
            System.out.println("OTP is: " + m.group());               //group() returns the matched text
        }
	}
	/*//Using StringBuilder class
	        
	        /* String str="hello master 234567  vijji hello ra &^%$ ";
        StringBuilder digits=new StringBuilder();
        for(char ch: str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                digits.append(ch);
            }
        }
        System.out.println(digits);*/
	        
	        //Using regex
	        
	        /* String str="hello master 234567  vijji hello ra &^%$ ";
       String digits=str.replaceAll("[^0-9]","");
       System.out.println(digits);*/

}
