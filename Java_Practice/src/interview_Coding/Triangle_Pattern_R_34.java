package interview_Coding;

public class Triangle_Pattern_R_34 
{
    public static void main(String[] args) 
    {
        for(int i = 0; i <= 5; i++) 
        {
        	//This loop prints decreasing spaces (two spaces for each iteration) starting from 5 down to i for each row. 
            for(int j = 5; j >= i; j--) 
            { 
                System.out.print("  "); //2 spaces
            }
            for(int k = 1; k <= i; k++)
            { 
                System.out.print(" " + "*");  //1 space
            }
            System.out.println(); // Moves to the next line after each row is printed.
        }
    }
}
