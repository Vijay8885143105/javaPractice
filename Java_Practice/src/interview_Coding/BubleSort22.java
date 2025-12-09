package interview_Coding;

import java.util.Arrays;

public class BubleSort22 {

	public static void main(String[] args) {
		int a[]= {40,30,90,65,20,10,95,90};
		//Arrays.toString() This will print all elements in the array in the form of string
		System.out.println("Arrays before sorting "+Arrays.toString(a)); // [40, 30, 90, 65, 20, 10, 95]
		int len=a.length; // length for arrays , length() for Strings
		System.out.println("Arrays length    "+len);
		for(int i=0;i<len-1;i++)      //Number of Passes 
		{
			for (int j = 0; j <len-1; j++) {  //Iterations in each pass
				if (a[j]>a[j+1]) {                   //In each pass, this loop compares each element with its next element
					int temp=a[j];                 //If the current element is greater, the code swaps them.
					a[j]=a[j+1];                       //Now a[j] becomes equal to the next number.
					a[j+1]=temp;                   //Put the stored (original) value into the next position
				}
			}	
		}
		System.out.println("Arrays after sorting "+Arrays.toString(a));

	}
}
