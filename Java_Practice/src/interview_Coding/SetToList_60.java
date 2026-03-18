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
		
		System.out.println("=================================================================================================");
		/* Sort the arrays and add them both                               **IntStream.concat**
		 
        int a1[] = {10, 2, 5, 4, 3};
        int a2[] = {2, 5, 9, 6, 3};

        Arrays.sort(a1);
        Arrays.sort(a2);

        // Simple merging (no loops)
        int result[] = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2))   //Arrays.stream(a1) → converts array to stream
                                .toArray();                                                                                               //Arrays.stream(a2) → converts second array
                                                                                                                                                  //IntStream.concat() → joins both streams
        System.out.println("Merged array: " + Arrays.toString(result));             //IntStream is an interface in Java Stream API used to handle sequences of primitive int values efficiently.
    }
}*/
		System.out.println("=================================================================================================");
	//Difference between the 2 consecutive numbers                       **Math.abs**
		
		        int a[] = {1, 3, 5, 7, 8, 12};

		        for (int i = 0; i < a.length - 1; i++) 
		        {
		            int diff = a[i + 1] - a[i];
		            System.out.println(diff);
		        }
		        
		       /* int a[] = {1, 8, 5, 7, 8, 12};

		        for (int i = 0; i < a.length - 1; i++) {
		            int diff = Math.abs(a[i + 1] - a[i]);      //Math.abs() makes sure the difference is always positive.
		            System.out.println(diff);*/
		    
		System.out.println("=================================================================================================");


	}

}
