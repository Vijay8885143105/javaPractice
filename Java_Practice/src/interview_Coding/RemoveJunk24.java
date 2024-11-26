package interview_Coding;

public class RemoveJunk24 {

	public static void main(String[] args) {
//replaceAll() method to remove all characters from the string str that are not letters (a-z, A-Z) or digits (0-9).
		String str="Vija%^^&*y7889987@@##65432vasa*&^%$vi";
		//String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(str1);   //Vijay788998765432vasavi

	//replaceAll() method to remove all letters (a-z, A-Z) and digits (0-9) from the string str	
		String str1 = str.replaceAll("[a-zA-Z0-9]", "");     //regular Expression, empty
		System.out.println(str1);     //%^^&*@@##*&^%$
	}

}
