package interview_Coding;

import java.util.Arrays;

public class EvenOddNmbrsUsingStreams_53
{
	 public static void main(String[] args) {
	      /*  int a[] = {2, 3, 4, 5, 6, 7, 8, 9};

	               Arrays.stream(a)                //This converts the array into a stream.
	              .filter(n -> n % 2 == 0) //This is a lambda expression//filter() method removes unwanted values and keeps only the ones that pass a condition.
	              .forEach(System.out::println);*/  //Print each number  //forEach() processes each remaining element in the stream.
		 int a[]={1,2,3,34,5,6};
	        Arrays.stream(a)
	        .filter(n->n%2!=0)
	        .forEach(System.out::println);
	    }
}
