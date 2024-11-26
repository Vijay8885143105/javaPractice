package interview_Coding;
public class Seperate_Character_algrthm35
{
	public static void main(String args[])
	{
		String str="sumitMT28";
		StringBuilder lowercase=new StringBuilder();
		StringBuilder uppercase=new StringBuilder();
		StringBuilder digits=new StringBuilder();

		for(char ch:str.toCharArray())
		{
			//Checking for lower case letters
			if(ch>='a'&&ch<='z')
			{
				lowercase.append(ch);
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
		//Output of the Results
		System.out.println(lowercase);
		System.out.println(uppercase);
		System.out.println(digits);
	}
}