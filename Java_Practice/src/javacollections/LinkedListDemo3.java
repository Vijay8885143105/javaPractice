package javacollections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Rat");
		l.add("Rat");
		l.add("Cat");
		l.add("Dog");
		l.add("Fox");
		System.out.println(l);                        //[Rat, Rat, Cat, Dog, Fox]

		//addFirst()                  //addLast()
		l.addFirst("Lion");                             
		System.out.println(l);                    //  [Lion, Rat, Rat, Cat, Dog, Fox]

		l.addLast("Tiger");
		System.out.println(l);                     //[Lion, Rat, Rat, Cat, Dog, Fox, Tiger]

		//getFirst()           //getLast()
		l.getFirst();
		System.out.println(l.getFirst());   //Lion

		l.getLast();
		System.out.println(l.getLast());             //Tiger

		//removeFirst()           removeLast()
		l.removeLast();
		System.out.println(l);                    //[Lion, Rat, Rat, Cat, Dog, Fox]

		l.removeFirst();
		System.out.println(l);                    //[Rat, Rat, Cat, Dog, Fox]
	}

}
