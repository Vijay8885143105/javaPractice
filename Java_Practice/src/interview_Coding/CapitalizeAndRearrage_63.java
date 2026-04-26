package interview_Coding;

public class CapitalizeAndRearrage_63 {

	public static void main(String[] args) {

		String input = "applicationjavastarted";

		// Split manually based on known words
		String part1 = "application";
		String part2 = "java";
		String part3 = "started";

		// Capitalize each word
		String result = capitalize(part2) + capitalize(part1) + capitalize(part3);  //Calls the capitalize() method on each word.
     //Assuming your capitalize() method makes the first letter uppercase:                                                                                                                                            //Rearranges the order
		System.out.println(result);
	}

	public static String capitalize(String word) {   //A method that takes a string word as input, Returns the same word with the first letter capitalized.
		return word.substring(0,1).toUpperCase() + word.substring(1);//- `word.substring(0,1)` → gets the **first character**
    //.toUpperCase()` → converts it to uppercase
	//word.substring(1)` → gets the rest of the string	- `+` → combines them
	//Example::::   "java"` → `"J"` + `"ava"` → `"Java"`
//========================================================================================================================
		//👉 If input had spaces (easier case)
		/*String input = "application java started";
        String words[] = input.split(" ");
        String result = "";

        // change order: java → application → started
        result = capitalize(words[1]) + capitalize(words[0]) + capitalize(words[2]);

        System.out.println(result);
    }

    public static String capitalize(String word)
    {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }*/
//========================================================================================================================
		//👉 I/p:applicationjavastarted        o/p:ApplicationJavaStarted    **Same the Order**
		/*String input = "application java started";
        String words[] = input.split(" ");
        String result = "";
        for (String word : words) {
           result = result + word.substring(0,1).toUpperCase() + word.substring(1);
        }
        System.out.println(result);*/

		
//========================================================================================================================
		//  **EXPLAIN THE OUTPUT OF THE BELOW PROGRAM **
		/*List<String> exams = Arrays.asList("OCA", "OCP");

        for (String e1 : exams) {
            for (String e2 : exams) {
                System.out.println(e1 + " " + e2);*/     
		//output::::
		//OCA OCA
		//OCA OCP
		//OCP OCA
		//OCP OCP
		
		
	        	/*When e1 = "OCA"
                      e2 = "OCA" → OCA OCA
                       e2 = "OCP" → OCA OCP
                     When e1 = "OCP"
                      e2 = "OCA" → OCP OCA
                     e2 = "OCP" → OCP OCP*/

	}
}

