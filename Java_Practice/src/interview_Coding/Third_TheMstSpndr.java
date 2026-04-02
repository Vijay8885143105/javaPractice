package interview_Coding;
import java.io.*;
import java.net.URL;
import java.util.*;

public class Third_TheMstSpndr {
    public static void main(String[] args) {
        try {
        	String fileUrl="https://public.karat.io/content/products.txt";   //A text file on the internet
            URL url = new URL(fileUrl);    // Prepares the program to read data from the internet,    //import java.net.URL;
            //InputStreamReader → Converts byte stream to character stream.
            //url.openStream() → Opens a stream to read data from the URL.    //Opens a stream (like downloading data)
            //BufferedReader → Efficiently reads text line by line.
            
            //Reading Data from Internet
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); //import java.io.*;

            // Store total amount spent by each user
            Map<Integer, Double> totalSpent = new HashMap<>(); //Key → userId   ,  Value → total amount spent

            // Store product count for each user
            Map<Integer, Integer> productCount = new HashMap<>(); //Key → userId,  Value → number of products

            String line; //variable to store each line
           //Reading Each Line
            while ((line = br.readLine()) != null) {  //Reads file line-by-line until EOF (end of file).
                String  parts[] = line.split(",");           //Splits each line using comma ,  Example:: Date, userId, productName, $price
                if (parts.length < 4) continue;
                int userId = Integer.parseInt(parts[1].trim());//Gets the 2nd column (userId),trim() removes spaces,Converts string → integer.
                String priceStr = parts[3].trim().replace("$", "");//Gets the price column,Removes $ symbol.
                double price = Double.parseDouble(priceStr);      //Converts string → double.
                 //map.getOrDefault(key, defaultValue); ---->Syntax ------>getOrDefault is a  method
                // Update total spent
                totalSpent.put(userId, totalSpent.getOrDefault(userId, 0.0) + price);//If user exists → add price to existing value,
                                                                                                                                                      //If not → start from 0.0.
                // Update product count    
                productCount.put(userId, productCount.getOrDefault(userId, 0) + 1);//Increments number of products bought by user.
            }

            // Find user who spent the most  (or) Initialize variables to track highest spender.
            int maxUser = -1;    //It means “no user found yet”   ,Safe because user IDs are positive
            double maxAmount = 0;

            for (int user : totalSpent.keySet()) {            //Loop through all users.
                if (totalSpent.get(user) > maxAmount) {  //Check if current user spent more than current max.
                    maxAmount = totalSpent.get(user);      //Update max values.
                    maxUser = user;
                }
            }

            // Output result
            System.out.println("User who spent most: " + maxUser);
            System.out.println("Total amount spent: $" + maxAmount);
            System.out.println("Number of products bought: " + productCount.get(maxUser));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


