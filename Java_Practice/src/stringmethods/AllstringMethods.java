package stringmethods;

public class AllstringMethods {

	public static void main(String[] args) {
		//Length
		String str="My name is Vijay";
		System.out.println(str.length());

		//Concatenation
		String str1="Welcome to";
		String str2="   Hindustan";
		System.out.println(str1+" "+str2);
		System.out.println(str1.concat(str2));
		System.out.println("Welcome to"+"   Hindustan");
		
		//Equals
		String str3="INDIA";
		String str4="India";
		System.out.println(str3.equals(str4));//false
		String str5="MANGODB";
		String str6="MANGODB";
		System.out.println(str5.equals(str6));//true
		
		//EqualsIgnoreCase
		String st="I a going to hyderabad";
		String st1="i a GOING to hydeRAbad";
		System.out.println(st.equalsIgnoreCase(st1));//true
		//EqualIgnoreCase1
		String v="I a going to yderabad";
		String v1="i a GOING to hydeRAbad";
		System.out.println(v.equalsIgnoreCase(v1));//false
		
		//Contains
		String A="He is going to America";
		System.out.println(A.contains("to"));//true
		System.out.println(A.contains("ing"));//true
		System.out.println(A.contains("gniog"));//false
		
		//Substring    //starting index start from 0,Ending index start from 1
		//Extracting substring from the main string
		String b="WELCOME";
		System.out.println(b.substring(0,3));//WEL
		System.out.println(b.substring(1,3));//EL
		System.out.println(b.substring(2,7));//LCOME
		
		//Replace
		String f="car";
		System.out.println(f.replace('c', 'k'));
		System.out.println(f.replace("car", "Gear"));
		
		//CharAt
		String vas="HindhuOcean";
		System.out.println(vas.charAt(0));
		System.out.println(vas.charAt(1));
		System.out.println(vas.charAt(6));
		System.out.println(vas.charAt(10));
		
		//starts with  //endswith
		String sav="India is a Republican country";
		System.out.println(sav.startsWith("india"));//false
		System.out.println(sav.startsWith("India"));//true
		System.out.println(sav.endsWith("Republican country"));//true
		System.out.println(sav.endsWith("try"));//true
		System.out.println(sav.endsWith("countr"));//false



		








	}

}
