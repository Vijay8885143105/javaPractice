package Interview_Coding;

public class RemoveJunk24 {

	public static void main(String[] args) {
		String str="Vija%^^&*y7889987@@##65432vasa*&^%$vi";
		//String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(str1);   //Vijay788998765432vasavi

		
		String str1 = str.replaceAll("[a-zA-Z0-9]", "");     //regular Expression, empty
		System.out.println(str1);     //%^^&*@@##*&^%$
	}

}
