package dataStuctures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		System.out.println("No of elmts before put           "+hm.size());
		hm.put(100, "Vijay");
		hm.put(200, "Ajay");
		hm.put(300, "Tanya");
		hm.put(400, "Ananya");
		System.out.println("No of elmts After put              "+hm.size());
		System.out.println("elmnts in Hash Map         "+hm);
		//if you want to come your out put line by line ,then u have to use for each loop
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"      "+m.getValue());
		}
		hm.remove(200);
		System.out.println("After Removing By Object Value  No of Elmnts     "+hm.size());
		System.out.println("Elemenents in HashMap After Removing        "+hm);



	}
}
