package interview_Coding;

import java.util.ArrayList;
import java.util.HashSet;

public class SetToList_60 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		ArrayList<String> list = new ArrayList<>(set);
		System.out.println(list);
		
		 //Using addAll method
		 /*HashSet<String> set = new HashSet<>();
                                             set.add("X");
                                              set.add("Y");

             ArrayList<String> list = new ArrayList<>();
                                                 list.addAll(set);
*/
	}

}
