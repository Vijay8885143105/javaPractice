package interview_Coding;

import java.util.*;
class T_Equilateral_Numbers34{
    public static void main(String[] args)
    {                                                                                                   
        int n=6;
        for(int i=1;i<=6;i++)   //rows
        {
            for(int j=1;j<=i;j++)  //spaces  //number of spaces increases with each line
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)    //This loop prints the numbers starting from i to n.
            {
                System.out.print(k+" ");
            }
            System.out.println();  //moves to the next line after each row is printed.
        }
    }
}
