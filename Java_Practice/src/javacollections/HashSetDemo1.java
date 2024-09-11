package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		//HashSet hs=new HashSet();           //default capacity  16 and load factor is 0.75
		//HashSet hs=new HashSet(100);       //initial capacity 100
		//HashSet hs=new HashSet(100,(float)0.90);       
		//HashSet<Integer>hs=new HashSet<Integer>();
		//default capacity  16 and load factor is 0.75
		HashSet hs=new HashSet();
		hs.add(120);
		hs.add("Manusha");
		hs.add('K');
		hs.add(3.45);
		hs.add(true);
		hs.add(null);
		System.out.println(hs);      //[null, 3.45, 120, Manusha, K, true]   //Insertion order should not be preserved
		hs.remove(3.45);
		System.out.println(hs);     //[null, 120, Manusha, K, true]
		System.out.println(hs.size());    //5
		System.out.println(hs.isEmpty());          //false 
		System.out.println(hs.contains("Manusha"));   //true
		System.out.println(hs.contains("Sandya"));   //false
		/*	hs.clear();
		System.out.println(hs);            //[]*/
		//Reading the all elements by using for each loop
		System.out.println("Reading elements by using for each loop");
		for (Object j : hs) {
			System.out.println(j);
		}
		System.out.println("===========================================");
		//Reading the all elements by using iterator
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		
		}









	}

}
