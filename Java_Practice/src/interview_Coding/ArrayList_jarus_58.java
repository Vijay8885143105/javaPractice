package interview_Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_jarus_58 {

	public static void main(String[] args) {
		//Arrays.asList("T1", "T2", "T3", "T4", "T5") → Converts the array into a fixed-size list.
		//new ArrayList<>(...) → Creates a mutable ArrayList from that list.
		 ArrayList<String> list = new ArrayList<>(Arrays.asList("T1", "T2", "T3", "T4", "T5"));
      //Now list contains: [T1, T2, T3, T4, T5]   
		 //list.replaceAll() → ArrayList method that replaces each element using a UnaryOperator.
		 //UnaryOperator is a functional interface in Java  (Input type = Output type)
	        list.replaceAll(s -> s.replaceAll("T2", "jarus"));
	        //s -> s.replaceAll("T2", "jarus") → Lambda expression:
	        // For each element s, check if it matches "T2",  If yes, replace it with "jarus".
	        System.out.println(list);
	        
	        
	        /*ArrayList<Integer> list=new ArrayList<>(Arrays.asList(100,24,3,44,35));
                                          Collections.sort(list);
                                           System.out.println(list);*/
    

	}

}
