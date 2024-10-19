package dataStuctures;

import java.util.ArrayList;

public class Length_Readof_arraylist {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList();
		list.add("Vijay");
		list.add("Vasavi");
		list.add("Lavanya");
		list.add("Madhunitha");
		list.add("Mounika");
		list.add("Navya");
		list.add("Meghana");
		list.add("Swapna");
		list.add("sarayu");
		System.out.println(list.size());  //9
		for(String l: list)
		{
			System.out.println(l);
		}




	}

}
