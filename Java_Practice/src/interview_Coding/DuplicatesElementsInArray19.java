package interview_Coding;

import java.util.HashSet;

public class DuplicatesElementsInArray19 {

	public static void main(String[] args) {
		/*String arr[]= {"java","Python","C","C#","java",".Net","Python"};
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) 
				{
					System.out.println("Duplicate element  found   ::::"+arr[i]);
					flag=true;			
				}
			}
		}
		if (flag==false)
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
