package javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		//LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>(); //for homogeneous Data
		HashSet Hset=new HashSet();
		Hset.add(100);
		Hset.add(200);
		Hset.add(300);
		Hset.add(400);
		Hset.add(500);
		System.out.println(Hset);                //[400, 100, 500, 200, 300]   Stored in  Random Order
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println(lset);               //[100, 200, 300, 400, 500]   Insertion Order preserved
  


		

	}

}
