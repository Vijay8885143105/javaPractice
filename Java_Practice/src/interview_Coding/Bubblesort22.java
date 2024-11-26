package interview_Coding;
import java.util.*;
public class Bubblesort22{
	public static void main(String[] args){
		int arr[] = {4,6,0,3,7,0,9};
		System.out.println(Arrays.toString(arr)); //method is used to print the array in a readable format.
		int len = arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1-i;j++)
			{
				//compares each pair of adjacent elements. If the current element (a[j]) is smaller than the next element (a[j + 1]), they are swapped. 
				if(arr[j]<arr[j+1])
				{
					//The swap operation is performed using a temporary variable temp:
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}      
		System.out.println(Arrays.toString(arr));     
		/*for(int num :arr){
           // System.out.print(num+",");
       }*/
	}
}