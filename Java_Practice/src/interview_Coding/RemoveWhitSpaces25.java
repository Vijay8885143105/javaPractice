package interview_Coding;

public class RemoveWhitSpaces25 {

	public static void main(String[] args) {
		String str="Vijay         learining          selenium       easily  ";
		System.out.println("Before removing white spaces::::::"+str);
//  \\s matches any whitespace character, and replaceAll() replaces these characters with an empty string "".
		String str1 = str.replaceAll("\\s","" );
		System.out.print("After removing  white spaces::::::"+str1);
		
	//If you need to print space  after each 3 characters in the given string	
	/*	String str = "Vijaylearningseleniumeasily";
		System.out.println("Before adding spaces::::::" + str);

		// Insert space after every 3 characters
		 //. → matches any character , {3} → exactly 3 characters
		String str1 = str.replaceAll("(.{3})", "$1 ");  
		//$1 → means "the first captured group" , add one space.
                                                                                           
		System.out.println("After adding spaces::::::" + str1);*/

	}
}
