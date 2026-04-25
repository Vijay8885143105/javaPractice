package interview_Coding;

public class CapitalizeAndRearrage_63 {

	public static void main(String[] args) {

		String input = "applicationjavastarted";

		// Split manually based on known words
		String part1 = "application";
		String part2 = "java";
		String part3 = "started";

		// Capitalize each word
		String result = capitalize(part2) + capitalize(part1) + capitalize(part3);

		System.out.println(result);
	}

	public static String capitalize(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1);

		//👉 If input had spaces (easier case)
		/*String input = "application java started";
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            result += word.substring(0,1).toUpperCase() + word.substring(1);
        }
        System.out.println(result);*/

		
		
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

	}
}

