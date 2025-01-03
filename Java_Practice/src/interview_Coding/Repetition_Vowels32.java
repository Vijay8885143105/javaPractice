package interview_Coding;
public class Repetition_Vowels32
{
	public static void main(String[] args) {	
		//Arrays.asList(): Converts an array to a List.
		//Arrays.toString(): Converts an array to a String.
		
		
		String str ="mariajatrutha";
		String vowels = "";      //initializes an empty string to store vowels.
		int count = 0;                //initializes a counter for the number of vowels.
		//Convert the string to a character array and iterate over each character
		for(char var:str.toCharArray())
		{
			//Check if the character is a vowel
			//indexOf() method to check for vowels in the string
			if("aeiou".indexOf(var) !=-1)  //it is a simple and effective way to check for vowels.
			{
				vowels =vowels+var;  //Add the vowel to the vowels string
				count++;                         //Increment the vowel count
			}
		}
		System.out.println(vowels);
		System.out.println(count);
		
        //Count occurrences of each vowel
		int charcount[] = new int[256];  //256 is the size of the ASCII character set
		for(char c:vowels.toCharArray())
		{
			charcount[c]++;    //increment the count for the specific vowel
		}
		        // Print the count of each vowel
		for(int i=0;i<charcount.length-1;i++)
		{
			if(charcount[i]>0)
			{
				//i is an integer that represents an ASCII value.
				//(char)i casts the integer i to its corresponding character. 
				System.out.println((char)i+":"+charcount[i]+"times");
			}
		}
	}
}
