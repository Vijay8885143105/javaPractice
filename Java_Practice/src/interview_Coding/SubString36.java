package interview_Coding;
import java.util.*;
public class SubString36{
// space is also one character
	public static void main(String args[]) {
		/*String str="I love automation testing";

		String str1=str.substring(18,25);
		System.out.println(str1);*/
		String str="I love my india";
		String words[]=str.split(" ");    //split the string by using space as the separator
		System.out.println(words[3]);
	}
}