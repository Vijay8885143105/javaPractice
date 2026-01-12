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
                                                 list.addAll(set);*/

		
		/*ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");  // duplicate

		HashSet<String> set = new HashSet<>(list);
		System.out.println(set);*/
		
		
		//Using addAll method
		/*ArrayList<Integer> list = new ArrayList<>();
                                                 list.add(10);
                                                 list.add(20);

              HashSet<Integer> set = new HashSet<>();
                                                    set.addAll(list);
*/

	}

}
