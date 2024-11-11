package interview_Coding;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements23 {

	public static void main(String[] args) {
	      // Approach 1
		/* int a[]= {20,40,30,50,60,10};
       System.out.println("Arrays before sorting   "+Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("Arrays after sorting   "+Arrays.toString(a));*/

		//Approach 2
		//Reverse Order
		/*  Integer a1[]= {20,40,30,50,60,10};
       System.out.println("Arrays before sorting   "+Arrays.toString(a1));
       Arrays.sort(a1);
       System.out.println("Arrays After sorting   "+Arrays.toString(a1));
       Arrays.sort(a1,Collections.reverseOrder());
       System.out.println("Arrays  Reversed after sorting   "+Arrays.toString(a1));*/

		//Approach 3
		int a[]= {20,40,30,50,60,10};
		System.out.println("Arrays before sorting   "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays after sorting   "+Arrays.toString(a));
	}

}
