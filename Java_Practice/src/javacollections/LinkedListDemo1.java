package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		//Declare LinkedList
		//LinkedList<integer>ll=new LinkedList<integer>();     For Homogeneous Data
		//LinkedList<string>ll=new LinkedList<string>();           For Homogeneous Data
		LinkedList l=new LinkedList();                                             // For Heterogeneous Data
		l.add(100);
		l.add(26.97);
		l.add("Ananthapuram");
		l.add('A');
		l.add(true);
		System.out.println(l);     //[100, 26.97, Ananthapuram, A, true]

		//size()
		System.out.println(l.size());     //5

		//remove()
		System.out.println(l.remove(3));    //A

		//insert()   Add the Value or Object in the middle of somewhere in to the Linked List
		l.add(2, "Ongole");
		System.out.println(l);      //[100, 26.97, Ongole, Ananthapuram, true]
		//Retrieving Value or object
		//get()
		l.get(1);
		System.out.println(l.get(1));     //26.97

		//set()     Replace the value or object with new object
		l.set(0, 10000);
		System.out.println(l);      //[10000, 26.97, Ongole, Ananthapuram, true]

		//contains()
		System.out.println(l.contains("Ongole"));      //true
		System.out.println(l.contains("Ongo"));         //false

		//isEmpty()
		System.out.println(l.isEmpty());    //false

		//Add null value also
		l.add(null);
		System.out.println(l);       //[10000, 26.97, Ongole, Ananthapuram, true, null]
		System.out.println("==================================================");
		//Reading elements using for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("==================================================");
		//Reading all elements using for each loop
		for (Object h : l) {
			System.out.println(h);
		}
		System.out.println("==================================================");
		//Reading all elements using iterator
		Iterator it=l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
