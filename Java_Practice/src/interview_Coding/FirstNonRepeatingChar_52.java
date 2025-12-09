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
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
    }

