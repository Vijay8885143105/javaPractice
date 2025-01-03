package interview_Coding;

import java.util.HashSet;

public class DuplicatesElementsInArray19 {

	public static void main(String[] args) {
		//length is a property & length() is a method
		/*String arr[]= {"java","Python","C","C#","java",".Net","Python"};
		boolean flag=false;
		//Initially, flag is set to false because, at the start of the program, we haven't yet checked for duplicates, so we assume there are none.
		// Iterate over each element in the array
		for (int i = 0; i < arr.length; i++)
		 {
		 //Check each element against the subsequent elements
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]))
				{
					System.out.println("Duplicate element  found   ::::"+arr[i]);
					flag=true;			 //Indicating a Duplicate Has Been Found:
				}
			}
		}
		if (flag==false)  //If flag == false, it means no duplicates were found during the iterations.
		{
			System.out.println("Duplicate element   not found");
		}*/
		String arr[]= {"java","Python","C","C#","java",".Net","Python"};
		boolean flag=false;
		HashSet<String> hs=new HashSet<>();
		for (String d : arr) {
			if (hs.add(d)==false) {
				System.out.println("Duplicate element found :::"+d);
				flag=true;
			}
		}
		if (flag==false) {
			System.out.println("No duplicate element in the array");
		}
	}
}
