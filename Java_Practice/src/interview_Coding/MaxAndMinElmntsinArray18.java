package interview_Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxAndMinElmntsinArray18 {

	public static void main(String[] args) {
		/* int a[]= {10,20,30,40,50,60,70};
    int min=a[0];
    //Initialize min  with the first element of the array
    for (int i = 1; i <a.length; i++) {
    	if (a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Minimum number Array is  "+min);	*/
		int a[]= {10,20,30,40,50,60,70};
		//Initialize max with the first element of the array
		//The loop starts from the second element (i = 1) and compares each element 
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number in Array is  "+max);
		System.out.println("============================================");
		int a1[] = {10, 20, 30, 40, 50, 60, 70};

        // Sort the array in ascending order
        Arrays.sort(a1);

        // The second largest element is at index n-2
        System.out.println("Second largest number in the array is " + a1[a1.length - 2]);
		System.out.println("============================================");

                ArrayList<Integer> numbers = new ArrayList<>();
                Scanner scr = new Scanner(System.in);
                System.out.print("Enter the number of elements ");
                int num = scr.nextInt();
                System.out.println("Enter " + num + " numbers:");
                for (int i = 1; i <=num; i++) 
                {
                    numbers.add(scr.nextInt());
                }
                // Sort the dynamic array in ascending order
                Collections.sort(numbers);
                // The second largest element is at index size - 2 after sorting
                System.out.println("Second largest number in the array is " + numbers.get(numbers.size() - 2));
                scr.close();
            }
	}

