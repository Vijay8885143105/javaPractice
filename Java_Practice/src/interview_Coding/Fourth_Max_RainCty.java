package interview_Coding;
import java.io.*;

public class Fourth_Max_RainCty {

    public static void main(String[] args) throws Exception {

    	// Step 1: Open file for reading
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String line;          // To store each line
        int maxRain = 0;      // To store highest rainfall
        String maxCity = "";  // To store city with highest rainfall

        // Step 2: Read file line by line
        while ((line = br.readLine()) != null) {

            // Step 3: Split line using comma
            String parts[] = line.split(",");

            // Step 4: Extract city and rainfall
            String city = parts[1];                                  //city → second column of the line, stores the city name.
            int rain = Integer.parseInt(parts[2]);     //rain → third column of the line, converted to integer using Integer.parseInt().

            // Step 5: Compare with current maximum
            if (rain > maxRain) {

                // Step 6: Update max values
                maxRain = rain;
                maxCity = city;
            }
        }

        // Step 7: Close the file
        br.close();

        // Step 8: Print result
        System.out.println("City with highest rainfall: " + maxCity);
        System.out.println("Rainfall value: " + maxRain);
    
    }
}
