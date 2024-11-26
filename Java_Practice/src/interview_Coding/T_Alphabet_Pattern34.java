package interview_Coding;

public class T_Alphabet_Pattern34 {

	public static void main(String[] args) {
		int alpha=65;     //65 ASCII value of A
		// This loop runs 6 times (from 0 to 5), representing the rows of the pattern.
          for(int i=0;i<=5;i++)
          {
        	  //This loop prints characters. The number of characters increases with each row.
        	  for(int j=0;j<=i;j++)
        	  {
        // This converts the ASCII value to a character and prints it followed by a space.
        		  System.out.print((char)alpha+" ");
        	  }
        	  // This increments the ASCII value to the next character after each row is printed.
        	  alpha++;
        	  System.out.println();
          }
	}
}
