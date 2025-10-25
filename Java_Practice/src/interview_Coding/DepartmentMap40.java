package interview_Coding;

import java.util.HashMap;
import java.util.Map;

public class DepartmentMap40 {
	public static void main(String[] args) {
		//Basic, depid,2 ways for each loop
		
		/*Creating a HashMap to store department ID (Integer) and department name (String)
        HashMap<Integer, String> hm = new HashMap<>();

        // Adding department IDs and names to the HashMap
        hm.put(101, "Human Resources");
        hm.put(102, "Finance");
        hm.put(103, "Engineering");
        hm.put(104, "Marketing");
        //System.out.println(hm);

        //Displaying all department IDs and names
        System.out.println("Department ID and Names:");
        for (Integer id : hm.keySet()) {
            System.out.println("ID: " + id + ", Name: " + hm.get(id));
        }

        // Example: Retrieve a department name using its ID
        int departmentId = 103; // Change this to test with different IDs
        if (hm.containsKey(departmentId))
        {
            System.out.println("Department with ID " + departmentId + ": " + hm.get(departmentId));
        } 
        else
        {
            System.out.println("Department with ID " + departmentId + " not found.");
        }*/


		System.out.println("=================================================================================================");

		// Create a HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// Add some key-value pairs to the HashMap
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		// Iterate through the HashMap
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// Get key and value from the entry
			String key = entry.getKey();
			Integer value = entry.getValue();

			// Print the key and value
			System.out.println("Key: " + key + ", Value: " + value);
		}
		
		System.out.println("=================================================================================================");

		// Modify the value of an entry 
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getKey().equals("Banana")) {
				// Set a new value for the entry
				Integer oldValue = entry.setValue(5);

				// Print the old value and the new value
				System.out.println("Old Value for 'Banana': " + oldValue);
				System.out.println("New Value for 'Banana': " + entry.getValue());
			}
		} 
		for(Map.Entry<String,Integer> entry: map.entrySet())
		  {
		      System.out.println(entry);
		  }
		System.out.println("================================================================================================");
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(100,"vijji");
		hm.put(101,"fuji");
		hm.put(102,"konni");
		hm.put(103,"anni");
		System.out.println(hm);
		for(Map.Entry<Integer,String> entry:hm.entrySet())
		{
			if(entry.getKey().equals(101))
			{
				System.out.println(entry.getKey()+" "+entry.getValue());

			}
		}
	}
}

