package interview_Coding;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

//Class to store user details
class User {
 String name;        // stores user name
 int bookCount;      // number of books read
 int totalPages;     // total pages read

 // Constructor to initialize user
 User(String name) {
     this.name = name;
     this.bookCount = 0;
     this.totalPages = 0;
 }
}

public class Sixth_BooksRead_TotlNmberPgs {
 public static void main(String[] args) {

     try {
         // Step 1: Define file URL (CSV file)
         String fileUrl = "https://example.com/data.csv";   //👉 This is the location of the CSV file on the internet.

         // Step 2: Convert String → URI → URL (modern Java approach)
         URI uri = new URI(fileUrl);    //👉 Converts string → URI → URL to access the file.
         URL url = uri.toURL();

         // Step 3: Create a HashMap
         // Key = userId
         // Value = User object (stores name, bookCount, pages)
         Map<String, User> map = new HashMap<>();    //Key → userId, Value → User object

         // Step 4: Open connection and read file
         // try-with-resources automatically closes BufferedReader
         try (BufferedReader br = new BufferedReader(
                 new InputStreamReader(url.openStream())
         )) {

             String line;

             // Step 5: Read file line by line
             while ((line = br.readLine()) != null) {

                 // Step 6: Remove extra spaces
                 line = line.trim();

                 // Skip empty lines
                 if (line.isEmpty()) continue;

                 // Step 7: Split CSV data using comma  ,👉 Splits line into columns using comma.
                 String parts[] = line.split(",");

                 // Ensure valid data (at least 4 columns)
                 if (parts.length < 4) continue;

                 // Step 8: Extract required fields
                 String userId = parts[0].trim();  // unique user ID
                 String name = parts[1].trim();    // user name

                 // Step 9: Convert pages from String → int safely
                 int pages;
                 try {
                     pages = Integer.parseInt(parts[3].trim());
                 } catch (NumberFormatException e) {
                     // Skip invalid numbers
                     continue;
                 }

                 // Step 10: If user not in map → add new user
                 map.putIfAbsent(userId, new User(name));

                 // Step 11: Get user object and update values
                 User u = map.get(userId);
                 u.bookCount++;          // increment book count
                 u.totalPages += pages;  // add pages
             }
         }

         // Step 12: Print all users' results
         for (String id : map.keySet()) {
             User u = map.get(id);

             System.out.println(
                     "User: " + u.name +
                     " (ID: " + id + ")" +
                     " | Books: " + u.bookCount +
                     " | Pages Read: " + u.totalPages
             );
         }

     } catch (Exception e) {
         // Step 13: Handle any errors
         e.printStackTrace();
     }
 }
}