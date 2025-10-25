package interview_Coding;

public class printWantedChar_42 {
    public static void main(String[] args) {
        String str = "selenium";
        
        // Initialize an empty result string
        String result = "";

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
        	//Character Extraction:
            char currentChar = str.charAt(i);
            //Condition to Check Specific Characters:
            if (currentChar == 'n' || currentChar == 'i')       
            {
            	//Appending Characters to Result
            	result = result + currentChar;      
            	}
        }

        // Print the result
        System.out.println(result);
    }
}
