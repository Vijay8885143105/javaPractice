package dataStuctures;

import java.util.ArrayList;

public class Add_Remove_Inserting {

	public static void main(String[] args) {
		ArrayList  al=new ArrayList();
		al.add("Vijay");
		al.add('A');
		al.add(10);
		al.add(20.23);
		al.add(true);
		System.out.println(al.size());  //5
		System.out.println(al);   //[Vijay, A, 10, 20.23, true]
		//inserting elements between elements
		al.add(0,"SeleniumTesting");
		System.out.println(al);    //[SeleniumTesting, Vijay, A, 10, 20.23, true]
		
		al.add(2,"Vasavi");
		System.out.println(al);  //[SeleniumTesting, Vijay, Vasavi, A, 10, 20.23, true]
		
		//Removing elements from array list
		//we can remove by index as well as direct value
		al.remove(0);
		System.out.println(al); //[Vijay, Vasavi, A, 10, 20.23, true]
		al.remove(0);
		System.out.println(al); //[Vasavi, A, 10, 20.23, true]
		al.remove("Vasavi");
		System.out.println(al);   //[A, 10, 20.23, true]
		al.remove(true);
		System.out.println(al);  //[A, 10, 20.23]
		al.remove(1);
		System.out.println(al);  //[A, 20.23]
		
		//Reading all elements from array list
		for (Object s: al)
		{
			System.out.println(s);
		}




		


	


		


		



	}

}
