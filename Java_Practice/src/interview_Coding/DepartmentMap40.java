package interview_Coding;

import java.util.HashMap;

public class DepartmentMap40 {
    public static void main(String[] args) {
        // Creating a HashMap to store department ID (Integer) and department name (String)
        HashMap<Integer, String> departmentMap = new HashMap<>();

        // Adding department IDs and names to the HashMap
        departmentMap.put(101, "Human Resources");
        departmentMap.put(102, "Finance");
        departmentMap.put(103, "Engineering");
        departmentMap.put(104, "Marketing");
        //System.out.println(departmentMap);

        //Displaying all department IDs and names
        System.out.println("Department ID and Names:");
        for (Integer id : departmentMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + departmentMap.get(id));
        }

        // Example: Retrieve a department name using its ID
        int departmentId = 103; // Change this to test with different IDs
        if (departmentMap.containsKey(departmentId))
        {
            System.out.println("Department with ID " + departmentId + ": " + departmentMap.get(departmentId));
        } 
        else
        {
            System.out.println("Department with ID " + departmentId + " not found.");
        }
    }
}

