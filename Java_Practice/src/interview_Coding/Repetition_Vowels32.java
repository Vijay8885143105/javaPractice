package interview_Coding;
public class Repetition_Vowels32
{
	public static void main(String[] args) {
		String str ="mariajatrutha";
		String vowels = "";      //initializes an empty string to store vowels.
		int count = 0;                //initializes a counter for the number of vowels.
		for(char var:str.toCharArray())
		{
			if("aeiou".indexOf(var) !=-1)
			{
				vowels =vowels+var;
				count++;
			}
		}
		System.out.println(vowels);
		System.out.println(count);
		
        //Count occurrences of each vowel
		int charcount[] = new int[256];  //256 is array size
		for(char c:vowels.toCharArray())
		{
			charcount[c]++;
		}
		        // Print the count of each vowel
		for(int i=0;i<charcount.length-1;i++)
		{
			if(charcount[i]>0)
			{
				System.out.println((char)i+":"+charcount[i]+"times");
			}
		}
	}
}
