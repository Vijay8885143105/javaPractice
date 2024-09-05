package javacollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(100);
		l.add(200);
		l.add(300);
		System.out.println(l);              //[400, 500, 600, 100, 200, 300]
		
		//addAll() method
		LinkedList new_l=new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);        //[400, 500, 600, 100, 200, 300]
		
		//removeAll() method
		new_l.removeAll(l);
		System.out.println("After removing all elements        "+new_l);         //[]
		
		//sort...........collections.sort()
		System.out.println("Before sorting             "+l);                      //[400, 500, 600, 100, 200, 300]
		Collections.sort(l);
		System.out.println("After sorting                  "+l);                      //[100, 200, 300, 400, 500, 600]
		
		//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order of elements after sorting                "+l);      // [600, 500, 400, 300, 200, 100]
		
		//shuffling of elements
		Collections.shuffle(l);
		System.out.println("Shuffling of elements after reverse order               "+l);


	}

}
