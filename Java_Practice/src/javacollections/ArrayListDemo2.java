package javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);          //[X, Y, Z, A, B, C]

		//Create New ArrayList
		//addAll() method
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println("After adding elements or objects            "+al);         //[X, Y, Z, A, B, C]

		//removeAll() method
		al_dup.removeAll(al_dup);
		System.out.println("After Removing elements or objects       "+al_dup);          //[]

		//sort .......Collections.sort()
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting elements or objects             "+al);

		//reverse order............Collections.reverseOrder()
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Reverse Order of Objects in the ArrayList After Sorting                   "+al);

		//shuffling ..........Collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Elements in the ArrayList  After shuffling                              "+al);
	}

}
