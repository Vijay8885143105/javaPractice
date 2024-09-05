package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Declare ArrayList
		//ArrayList al=new ArrayList();                                         For Heterogeneous Data 
		//ArrayList<Integer>al=new ArrayList<Integer>();     For   Homogeneous Data
		//ArrayList<String>al=new ArrayList<String>();          For   Homogeneous Data

		ArrayList al=new ArrayList();

		/*add ()  method
		al.add(100);
		al.add(26.67);
		al.add("JavaCollections");
		al.add('A');
		al.add(true);
		System.out.println(al);               //[100, 26.67, JavaCollections, A, true]

		//remove() method
			al.remove(4);
		System.out.println(al);                // [100, 26.67, JavaCollections, A]
		al.remove("JavaCollections");
		System.out.println(al);               //[100, 26.67, A]

		//Size() method
		al.size();
		System.out.println(al.size());     //5

		//isEmpty() method
		al.isEmpty();
		System.out.println(al.isEmpty());      //false

		//clear() method
		al.clear();
		System.out.println(al);   */            //[]

		//add ()  method Once Again
		al.add(100);
		al.add(26.67);
		al.add("JavaCollections");
		al.add('A');
		al.add(true);
		System.out.println(al);                //[100, 26.67, JavaCollections, A, true]

		//Insert New Element into ArrayList
		//add() method
		al.add(5, "This is the fifth element position");          
		System.out.println(al);                             //[100, 26.67, JavaCollections, A, true, This is the fifth element position]

		//contains() method
		System.out.println(al.contains("JavaCollections"));     //true
		System.out.println(al.contains("Python"));                    //false

		//Retrieve  Specifc Object from ArrayList
		//get() method
		al.get(0);
		System.out.println(al.get(0));                       //100


		//Replace element or Object
		//set() method
		al.set(2,"Vijay Collections");
		System.out.println(al);                           //[100, 26.67, Vijay Collections, A, true]




		/*System.out.println("Reading elements using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); 
			 Output :
			  100
			26.67
			Vijay Collections
			A
			true
			This is the fifth element position


		//	Using for each loop
			for (Object k : al) {
				System.out.println(k);
			} */


		//Using iterator
		Iterator it=al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}




















