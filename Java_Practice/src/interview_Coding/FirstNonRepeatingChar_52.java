package interview_Coding;

public class FirstNonRepeatingChar_52  {
	public static void main(String[] args) {
		//Unique elements in the array print
       /* String str = "aabbcdde";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");*/
		
		String str = "aabbcdde";                       //(or)  String  str="112233455";
        //char chars[] = str.toCharArray();
        for (char ch : str.toCharArray())
        {
            if (str.indexOf(ch) == str.lastIndexOf(ch))
            {
                System.out.println("First non-repeating character: " + ch);
                return;  //We found what we needed — stop everything and exit now, return; stops the loop AND exits the method entirely
            }
        }
        System.out.println("No non-repeating character found");
        
 System.out.println("================================================================================================");
        
        //Second non -repetitive character found
        
        /*String str = "aabbcddeeffghh";
              int uniqueCount = 0;  //             👉 This variable counts how many non-repeated characters we have found so far.

        for (char ch : str.toCharArray()) {    //Converts the string into a character array and loops through each character one by one.

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {      //👉 This checks whether the character appears only once in the entire string.
      uniqueCount++; //If ch unique,increase count  //indexOf(ch) → first occurrence position,lastIndexOf(ch) → last occurrence position
                                                                                                  //If both are equal → character is unique.
                if (uniqueCount == 2) {
                    System.out.println("Second non-repeating character is: " + ch);
                    return; //Stops the program immediately after finding the second unique character.
                }
            }
        }
        System.out.println("Second non-repeating character not found");*/
    }
    }

