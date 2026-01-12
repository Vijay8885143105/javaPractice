package interview_Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterNmsInArrayList_59 {
	public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Anil", "Ravi", "Ajay", "Suresh", "Arjun", "Bhanu")
        );

        names.stream()
             .filter(name -> name.startsWith("A"))  // starts with A
             .sorted()                              // sort alphabetically
             .forEach(System.out::println);         // print result
    }

}
