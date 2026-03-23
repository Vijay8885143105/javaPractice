package interview_Coding;

import java.io.*;
import java.net.*;
import java.util.*;

public class Fifth_Most_PplrURL {
    public static void main(String[] args) {
        try {
            // Step 1: Define the URL of the log file
            String fileUrl = "https://public.karat.io/content/urls2.txt";

            // Step 2: Create URL object (connect to the given link) ,        Prepares the program to read data from the internet.
            URL url = new URL(fileUrl);

            // Step 3: Open a stream to read data from the URL
            BufferedReader br = new BufferedReader(              //BufferedReader → reads the file line by line efficiently.
                    new InputStreamReader(url.openStream())    //InputStreamReader → converts bytes to characters.
            );                                                                                               //url.openStream() → opens a connection to the URL and returns a stream of bytes.

            // Step 4: Create a HashMap to store URL counts
            // Key = URL (String)
            // Value = number of times it appears (Integer)
            HashMap<String, Integer> hm = new HashMap<>();

            String line;

            // Step 5: Read the file line by line
            while ((line = br.readLine()) != null) {

                // Step 6: For each URL, update its count in the map
                // getOrDefault(line, 0) → returns current count or 0 if not present
                hm.put(line, hm.getOrDefault(line, 0) + 1);
            }

            // Step 7: Close the BufferedReader to free resources
            br.close();

            // Step 8: Initialize variables to track most frequent URL
            String mostPopular = ""; // stores the URL with highest count
            int maxCount = 0;        // stores highest frequency

            // Step 9: Iterate through the map to find max frequency
            for (String key : hm.keySet()) {

                // If current URL count is greater than maxCount
                if (hm.get(key) > maxCount) {
                    maxCount = hm.get(key);   // update max count
                    mostPopular = key;         // update most frequent URL
                }
            }
            // Step 10: Print the result
            System.out.println("Most popular URL: " + mostPopular);
            System.out.println("Count: " + maxCount);

        } catch (Exception e) {
            // Step 11: Handle any errors (network/file issues)
            e.printStackTrace();
        }
    }
}