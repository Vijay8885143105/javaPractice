package interview_Coding;

import java.util.Arrays;
import java.util.HashSet;

public class CheckArraysEquals16 {

	public static void main(String[] args) {
		/*Approach 1
                int a1[]= {1,2,3,4,5,6};
                int a2[]= {1,2,3,4,5,6};
            boolean  status= Arrays.equals(a1, a2);
              if (status==true) {
				System.out.println("Arrays are equal");
			}
              else
              {
            	  System.out.println("Arrays are Not equal");
              }*/
              
              //Approach 2
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
