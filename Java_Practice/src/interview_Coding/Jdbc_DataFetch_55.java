package interview_Coding;
import java.util.*;
public class Jdbc_DataFetch_55
{
	public static void main(String args[])
	{
		//Loads the JDBC driver
		//Connects to the database
		//Executes a SQL query
		//Fetches the data using ResultSet
		//Prints each row
		//Closes all connections
		
		 // Database connection details
		
      /*  String url = "jdbc:mysql://localhost:3306/testdb";  // Change DB name
        String user = "root";                                // Change username
        String password = "password";                        // Change password

        try {
            // Load JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // Create SQL query
            String query = "SELECT id, name, email FROM users";

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute query and get the result set
            ResultSet rs = stmt.executeQuery(query);

            // Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " | " + name + " | " + email);
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }*/
    }
	}
