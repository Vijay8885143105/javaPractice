package interview_Coding;

import java .util.*;
class T_Equilateral_Pattern34{
    public static void main(String[] args)
    {
    //This loop runs 5 times (from 0 to 4), representing the rows of the triangle.
        for(int i=0;i<=4;i++)    //Rows
        {
        // This loop prints spaces. The number of spaces decreases with each row.
            for(int j=4;j>=i;j--)  //spaces
            {
                System.out.print(" ");    //Adds the necessary leading spaces to each row.
                
            }
           //This loop prints stars. The number of stars increases with each row.
            for(int k=0;k<=i;k++)  //stars
            {
                System.out.print("*"+" "); //Prints each star followed by a space
            }
            System.out.println();  //moves to the next line after each row is printed.
        }     
    }
}