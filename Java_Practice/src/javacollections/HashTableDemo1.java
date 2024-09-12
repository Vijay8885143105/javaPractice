package javacollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {
		//Hashtable t=new Hashtable();         Capacity is 11 and LoadFactor is 0.75
		//Hashtable t=new Hashtable(initial capacity);  //create HashTable object with some capaicity
		//Hashtable t=new Hashtable(initial capacity,fill ratio/Load factor);
		Hashtable<Integer, String> t= new Hashtable<Integer,String>();
		t.put(101, "Vijay");
		t.put(102, "Ajay");
		t.put(103, "Pradeep");
		t.put(104, "Mahesh");
		t.put(105, "Munvar");	
		//t.put(null, "Vijay");       //NullPointerException
		//t.put(106, null);              //NullPointerException
		System.out.println(t);      //{105=Munvar, 104=Mahesh, 103=Pradeep, 102=Ajay, 101=Vijay}
		System.out.println(t.get(104));    //Mahesh
		System.out.println(t.get(109));    //null
		System.out.println(t.remove(103));   //Pradeep
		System.out.println(t.remove(110));    //null
		System.out.println(t.containsKey(102));   //true
		System.out.println(t.containsKey(111));      //false
		System.out.println(t.containsValue("Munvar"));    //true
		System.out.println(t.containsValue("Kiran"));        //false
		System.out.println(t.isEmpty());         //false   ,   if HashTable is empty it returns True
		System.out.println(t);       //{105=Munvar, 104=Mahesh, 102=Ajay, 101=Vijay}
		System.out.println(t.keySet());   //[105, 104, 102, 101]
		System.out.println(t.values());  //[Munvar, Mahesh, Ajay, Vijay]
		System.out.println(t.entrySet());  //[105=Munvar, 104=Mahesh, 102=Ajay, 101=Vijay]
		
		//Reading all the elements or objects in the HahTable
		System.out.println("==============================================================");
		for (int entry: t.keySet()) {
			System.out.println(entry+"                    "+t.get(entry));
		}
		System.out.println("================================================================");
		
		//Entry Specific methods
		for  (Map.Entry entry: t.entrySet()) {
			System.out.println(entry.getKey()+"                       "+entry.getValue());
		}
		System.out.println("===============================================================");

		//Iterator 
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry	=(Entry)	itr.next();
			System.out.println(entry.getKey()+"                         "+entry.getValue());
		}















	}

}
