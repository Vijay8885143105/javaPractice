package javacollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String arr[]= {"Dog","Cat","Tiger","Elephant"};
		for (String s : arr) {
			System.out.println(s);
		}
		
		//Array Convert into array into ArrayList
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);                   //[Dog, Cat, Tiger, Elephant]


	}

}
