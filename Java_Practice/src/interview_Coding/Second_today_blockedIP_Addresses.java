package interview_Coding;
import java.io.*;    //java.io.* → Imports FileReader, BufferedReader, IOException and other I/O classes.
import java.time.LocalDate;

public class Second_today_blockedIP_Addresses {
    public static void main(String[] args) {

        // Step 1: File name (make sure the file exists in the same folder)
        String filePath = "blockedIP.txt";

        // Step 2: Counter for blocked IPs
        int count = 0;

        // Step 3: Get today's date in YYYY-MM-DD format
        String today = LocalDate.now().toString();    //import java.time.LocalDate;
        try {
            // Step 4: Create FileReader for the file          
            FileReader fr = new FileReader(filePath);     // OR    BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Step 5: Wrap FileReader with BufferedReader to read line by line
            BufferedReader br = new BufferedReader(fr);

            // Step 6: Variable to hold each line
            String line;

            // Step 7: Read file line by line
            while ((line = br.readLine()) != null) {   //readLine() returns null when there are no more lines.

                // Step 8: Split the line into parts by space
                String data[] = line.split(" ");

                // Step 9: Make sure line has enough parts
                if (data.length >= 3) {

                    String date = data[0];     // first part → date
                    String action = data[2];   // third part → Block/Allow

                    // Step 10: Count only today's "Block" actions
                    if (date.equals(today) && action.equalsIgnoreCase("Block")) {
                        count++;
                    }
                }
            }

            // Step 11: Close BufferedReader (also closes FileReader)
            br.close();

            // Step 12: Print the result
            System.out.println("Blocked IPs today: " + count);

        } catch (Exception e) {
            // Handle file not found or read errors
            System.out.println("Error: File not found or cannot read.");
        }
    }
}