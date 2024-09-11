package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {
		LinkedList q=new LinkedList();
		//Adding Elements                                                             add()         offer()
		q.add('A');
		q.add('B');
		q.add('C');
		q.offer('C');
		q.offer(100);      // Allows  Heterogeneous Data
		//System.out.println(q);     // [A, B, C, C, 100]   Insertion Order preserved , Duplicates Allowed

		//Get Head Element from queue                               element()      peek()
		//System.out.println(q.element());  //A  returns head element , if queue is empty returns NosuchElementException
		//System.out.println(q.peek());        //A returns head element, if queue is empty returns null
		//System.out.println(q);    //[]         if we comment queue

		//return & remove element from queue                   remove()      poll()
		/*System.out.println(q.remove());      //A, if we comment queue returns NoSuchElementException
	   System.out.println(q);                       //[B, C, C, 100]
	   System.out.println(q.poll());             //B, if we comment queue returns null
	  System.out.println(q);  */                     //[C, C, 100]

		//Reading All Elements from queue
		//By using iterator
		Iterator it=q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
System.out.println("===============================================");
		//By using for each loop
		for (Object OurWish : q) {
			System.out.println(OurWish);
		}
	}

}





