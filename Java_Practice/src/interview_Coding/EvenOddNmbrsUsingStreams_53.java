package interview_Coding;

import java.util.Arrays;

public class EvenOddNmbrsUsingStreams_53
{
	 public static void main(String[] args) {
	      /*  int a[] = {2, 3, 4, 5, 6, 7, 8, 9};

	        Arrays.stream(a)
	              .filter(n -> n % 2 == 0)
	              .forEach(System.out::println);*/
		 int a[]={1,2,3,34,5,6};
	        Arrays.stream(a)
	        .filter(n->n%2!=0)
	        .forEach(System.out::println);
	    }
}
