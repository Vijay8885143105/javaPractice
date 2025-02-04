package dataStuctures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<  String > list=new ArrayList< String >();
		//Add Elements to Array List
		list.add("Vijay");
		list.add("Lavanya");
		list.add("vasavi");
		list.add("swapna");
		list.add("sarayu");
		list.add("Mounika");
		list.add("Madhunitha");
		list.add("Meghana");
		list.add("Shirisha");
		list.add("Soumya");
		list.add("chandrika");
		list.add("Praneesha");
		list.add("Rashmi");
		System.out.println(list.size());   //Returns Number of Elements in Array List
		for (String v : list) {
			System.out.println(v);             //Reading Elements from Array List
		}
	}

}
