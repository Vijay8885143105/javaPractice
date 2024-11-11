package interview_Coding;

public class RemoveWhitSpaces25 {

	public static void main(String[] args) {
		String str="Vijay         learining          selenium       easily  ";
		System.out.println("Before removing white spaces::::::"+str);
		String str1 = str.replaceAll("\\s","" );
		System.out.print("After removing  white spaces::::::"+str1);
	}

}
