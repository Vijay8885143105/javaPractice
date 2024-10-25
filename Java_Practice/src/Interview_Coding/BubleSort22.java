package Interview_Coding;

import java.util.Arrays;

public class BubleSort22 {

	public static void main(String[] args) {
		int a[]= {40,30,90,65,20,10,95};
		//Arrays.toString() This will print all elements in the array in the form of string
		System.out.println("Arrays before sorting "+Arrays.toString(a));
		int n=a.length;
		System.out.println("Arrays length    "+n);
		for(int i=0;i<n-1;i++)      //Number of Passes 
		{
			for (int j = 0; j <n-1; j++) {  //Iterations in each pass
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		System.out.println("Arrays after sorting "+Arrays.toString(a));

	}
}
