package dataStuctures;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String>hm=new java.util.HashMap<Integer,String>();
		hm.put(100, "India");
		hm.put(101, "Hindustan");
		hm.put(102, "Aryavarthanam");
		hm.put(103, "Bharat");
		System.out.println(hm);   //{100=India, 101=Hindustan, 102=Aryavarthanam, 103=Bharat}
		//Reading all elements in HashMap by using for each loop
		for(Map.Entry g: hm.entrySet())
		{
			System.out.println(g.getKey()+"                        "+g.getValue());
		}

	}

}
