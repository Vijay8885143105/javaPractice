package interview_Coding;
public class Retrieving_same_words38
{
	public static void main(String args[])
	{
		//Use replace() when replacing fixed substrings or characters
		//Use replaceAll() when replacing patterns or using regex
		
		String str="an engineer is an engineer"; 
		String output=str.replace("is","");
		System.out.println(output);   //an engineer  an engineer
	}
}