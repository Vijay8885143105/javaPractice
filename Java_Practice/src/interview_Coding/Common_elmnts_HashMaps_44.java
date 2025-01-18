package interview_Coding;

	import java.util.*;

	public class Common_elmnts_HashMaps_44 {
	    public static void main(String[] args) {
	        HashMap<String, Integer> hm = new HashMap<>();
	        hm.put("vasavi", 1);
	        hm.put("kumar", 2);
	        hm.put("lavanya", 3);
	        hm.put("ravi", 4);
	        hm.put("praveen", 5);

	        HashMap<String, Integer> hm2 = new HashMap<>();
	        hm2.put("vasavi", 1);
	        hm2.put("kumar1", 2);
	        hm2.put("lavanya", 3);
	        hm2.put("ravi1", 4);
	        //containsKey()    and       get()     methods are important

	        // Find common key-value pairs
	        HashMap<String, Integer> commonElements = new HashMap<>();
	        for (Map.Entry<String, Integer> entry : hm.entrySet())
	        {
	        	/*hm2.containsKey("vasavi") is true.
	        	hm2.get("vasavi").equals(1) is true.
	        	Add "vasavi": 1 to commonElements.*/
	        	
	            if (hm2.containsKey(entry.getKey())     //Key: "vasavi", Value: 1
	                && hm2.get(entry.getKey()).equals(entry.getValue()))
	            {
	                commonElements.put(entry.getKey(), entry.getValue());
	            }
	        }

	        // Print common elements
	        System.out.println("Common Key-Value Pairs:      " + commonElements);
	    }
	}

