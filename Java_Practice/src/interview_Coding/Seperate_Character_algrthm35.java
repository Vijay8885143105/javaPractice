package interview_Coding;
public class Seperate_Character_algrthm35
{
	public static void main(String args[])
	{
		//String str="sumitMT35";
		//StringBuilder is a class in Java that is used to create mutable sequences of characters
		//stringBuilder used to create and modify strings efficiently.
		//StringBuilder objects to store different categories of characters
		//new ::This keyword is used to create a new instance of a class. It allocates memory for the new object
		
		/*StringBuilder lowercase=new StringBuilder();
		StringBuilder uppercase=new StringBuilder();   //This is the constructor of the StringBuilder class. 
		StringBuilder digits=new StringBuilder();
		
     //Iterate through each character in the string
		for(char ch:str.toCharArray())
		{
			//Checking for lower case letters
			if(ch>='a'&&ch<='z')
			{
				lowercase.append(ch);   //append means include
			}
			//Checking for upper case letters
			else if(ch>='A'&&ch<='Z')
			{
				uppercase.append(ch);
			}
			//Checking for digits
			else if(ch>='0'&&ch<='9')
			{
				digits.append(ch);
			}
		}
		//Print the content of each StringBuilder
		System.out.println(lowercase);
		System.out.println(uppercase);
		System.out.println(digits);*/
		
System.out.println("================================================================================================");
		//Approach 2
	     String str="sumitMT35";
	     String str1=str.replaceAll("[^A-Z]","");    //replaceAll is the pattern based (regular expression)
	     System.out.println(str1);
	          String str2=str.replaceAll("[^a-z]","");   //replace  is the simple replacement
	     System.out.println(str2);
	     String str3=str.replaceAll("[^0-9]","");
	     System.out.println(str3);

	}
}