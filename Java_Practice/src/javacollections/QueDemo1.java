package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueDemo1 {

	public static void main(String[] args) {
		PriorityQueue  q=new PriorityQueue();
		//Adding Elements                                                             add()         offer()
		q.add('A');
		q.add('B');
		q.add('C');
		q.offer('C');
		//q.offer(100);       Allows Only Homogeneous Data
		//System.out.println(q);            //[A, B, C, C] Insertion Order preserved , Duplicates Allowed

		//Get Head Element from queue                               element()      peek()
		//System.out.println(q.element());  //A  returns head element , if queue is empty returns NosuchElementException
		//System.out.println(q.peek());        //A returns head element, if queue is empty returns null
		//System.out.println(q);    //[]

		//return & remove element from queue                   remove()      poll()
		/*System.out.println(q.remove());      //A, if we comment queue returns NoSuchElementException
	   System.out.println(q);                        //[B, C, C]  
	   System.out.println(q.poll());             //B, if we comment queue returns null
	  System.out.println(q);    */                     //[C, C]

		//Reading All Elements from queue
		/* Iterator it=q.iterator();
	  while (it.hasNext()) {
		System.out.println(it.next());
	}*/
		for (Object OurWish : q) {
			System.out.println(OurWish);
		}
	}

}
