package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		//HashMap<Integer, String> m=new HashMap<Integer,String>();
		HashMap m =new HashMap();
		m.put(100, "Vasavi");
		m.put(101, "Vijay");
		m.put(102, "Mounika");
		m.put(103, "Meghana");
		m.put(104, "Madunitha");
		m.put(105, "Shirisha");
		m.put(106, "Lavanya");
		System.out.println(m);   //{100=Vasavi, 101=Vijay, 102=Mounika, 103=Meghana, 104=Madunitha, 105=Shirisha, 106=Lavanya}

		//get value from hashMap
		System.out.println(m.get(100));   //Vasavi  
		System.out.println(m.remove(105));    //Shirisha
		System.out.println(m);     //{100=Vasavi, 101=Vijay, 102=Mounika, 103=Meghana, 104=Madunitha, 106=Lavanya}
		System.out.println(m.containsKey(106));    //true
		System.out.println(m.containsKey(107));   //false
		System.out.println(m.containsValue("Madunitha"));// true
		System.out.println(m.containsValue("Navya"));    //false
		System.out.println(m.isEmpty());     //if hashMap is empty ,returns true
		System.out.println(m.keySet()); //returns all the keys as set  [100, 101, 102, 103, 104, 106]
		System.out.println(m.values());//returns all values as collection [Vasavi, Vijay, Mounika, Meghana, Madunitha, Lavanya]
		System.out.println(m.entrySet()); 

		//returns all the keys &values as set
		//[100=Vasavi, 101=Vijay, 102=Mounika, 103=Meghana, 104=Madunitha, 106=Lavanya]
		System.out.println("===========================================================================");

		//Reading all the elements using fo each loop
		for  (Object e : m.keySet()) {                     //we can use Object or integer here as data type
			System.out.println(e);
		}
		System.out.println(m.values());     //[Vasavi, Vijay, Mounika, Meghana, Madunitha, Lavanya]
		System.out.println("=====================================================================");
		for (Object k : m.values()) {
			System.out.println(k);
		}
		System.out.println("======================================================================");

		//entry methods
		for  (Object l : m.entrySet()) {
			System.out.println(l);
		}
		System.out.println("========================================================================");
		//iterator method
		Set s= m.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
