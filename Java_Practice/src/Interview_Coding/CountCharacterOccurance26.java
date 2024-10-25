package Interview_Coding;

public class CountCharacterOccurance26 {

	public static void main(String[] args) {
		String  str="Vijay willing to learn english";
		int Total_Count=str.length();
		System.out.println("Total length of the string ::::::"+Total_Count);
		String str1= str.replace("a", "");
		int Total_Count_AfterRemove=str1.length();
		System.out.println("Total length of the string after removing a::::::"+Total_Count_AfterRemove);
	}

}
