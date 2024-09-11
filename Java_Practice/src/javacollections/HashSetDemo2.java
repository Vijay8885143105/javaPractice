package javacollections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> even_Numbers=new HashSet<Integer>();
		even_Numbers.add(2);
		even_Numbers.add(4);
		even_Numbers.add(6);
		even_Numbers.add(8);
		System.out.println(even_Numbers);    // [2, 4, 6, 8]
		
	//	Creating New HashSet
		HashSet Numbers=new HashSet();
		
		//addAll() method
		Numbers.addAll(even_Numbers);
		Numbers.add(10);
		System.out.println(Numbers);            //[2, 4, 6, 8, 10]
		
		//removeAll() method
		Numbers.removeAll(even_Numbers);
		System.out.println(Numbers);       //[10]



	}

}
