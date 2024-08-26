package dataStuctures;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("Number of Elements before adding to array list      "+a1.size());
        a1.add(1234);
        a1.add("string");
        a1.add('C');
        a1.add(12.32);
        System.out.println("Number of Elemnets after Adding to Array List       "+a1.size());
        System.out.println("Elemements in Array List      "+a1);
        //Inserting Elements to Array List
        a1.add(0, "First Place of Position");
        a1.add(1,"Second Place of Position");
        System.out.println("Number of Elements after inserting elements to array List   "+a1.size());
        System.out.println("Elemements in Array List  After Inserting elements      "+a1);
        //Remove elements  from Array List by Index Number
        a1.remove(2);
        System.out.println("After Removing of Element By index Number       "+a1.size());
        System.out.println("After Removing ,Elements in Array List       "+a1);
        //Remove elements  from Array List by Direct Value
        a1.remove(12.32);
        System.out.println("After Removing of Element By  Direct Value      "+a1.size());
        System.out.println("After Removing ,Elements in Array List       "+a1);
                
	}

}
