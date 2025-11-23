package interview_Coding;

public class FirstNonRepeatingChar_52  {
	public static void main(String[] args) {
       /* String str = "aabbcdde";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");*/
		
		String str = "aabbcdde";
        char chars[] = str.toCharArray();
        for (char ch : chars) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
    }

