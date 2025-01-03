package interview_Coding;

import java.util.Arrays;
import java.util.HashSet;

public class CheckArraysEquals16 {

	public static void main(String[] args) {
		/*Approach 1
                int a1[]= {1,2,3,4,5,6};
                int a2[]= {1,2,3,4,5,6};
                //Arrays.equals(a1, a2) returns true if a1 and a2 are exactly the same.
            boolean  status= Arrays.equals(a1, a2); //This method checks if two arrays are equal in terms of both length and content order
              if (status==true) {
				System.out.println("Arrays are equal");
			}
              else
              {
            	  System.out.println("Arrays are Not equal");
              }*/
              
              //Approach 2
		//==  operator Compares object references to check if they point to the same object in memory.
		// equals() method   Intended to compare the contents (or values) of two objects.
		//==           It is used to compare the reference (memory address) of two objects.
		//equals    It is used to compare the contents (values) of two objects for equality.
              int[] arr1={1,2,3,4,5};
              int[] arr2={1,6,2,4,5};
              HashSet<Integer> hs1=new HashSet<>();
              HashSet<Integer> hs2=new HashSet<>();
              for(int i=0;i<arr1.length;i++)
              {
              hs1.add(arr1[i]);
              hs2.add(arr2[i]);
              }
              if(hs1.equals(hs2))
              	{
              	System.out.print("2 arrays are equal");
              	}
              else
              	{
              	System.out.print("2 arrays are not equal");
	}
}
}
