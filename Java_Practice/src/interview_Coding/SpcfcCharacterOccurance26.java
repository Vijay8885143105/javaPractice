package interview_Coding;

public class SpcfcCharacterOccurance26 {

	public static void main(String[] args) {
		String  str="Vijay willing to learn english";
		int Total_Count=str.length();
		System.out.println("Total length of the string ::::::"+Total_Count);
		String str1= str.replace("a", "");
		int Total_Count_AfterRemove=str1.length();
		System.out.println("Total length of the string after removing a::::::"+Total_Count_AfterRemove);
		System.out.println("a will be repeated " +(Total_Count-Total_Count_AfterRemove)+"    times");
		
		//replace() — Simple Replacement (NO REGEX)
		//replaceAll() — Pattern-Based Replacement (USES REGEX)
		
		//Replace the characters e,a with @ symbol
		/*String str = "republic day celebrated in the January";
		String result = str.replaceAll("[ea]", "@");
		System.out.println(result);*/
		
		
		
		/* String str="we celebrate republic dayb in the month of january";
	     String replace=str.replaceAll("[ra]","\\$");------------------>>>>>>>>>>>>>>>Difference is the \\
	     System.out.println(replace);*/
		
		
		//Replace the  w with x and y with z        (with replace method)
		/*String str = "we celebrate republic day in the month of january";

        String replace = str.replace('w', 'x')
                            .replace('y', 'z');

        System.out.println(replace);*/
		
		
		//Replace the  w with x and y with z        (with replaceAll method)
		/*String str = "we celebrate republic day in the month of january";

        String replace = str.replaceAll("w", "x")
                            .replaceAll("y", "z");

        System.out.println(replace);*/
	}
}
