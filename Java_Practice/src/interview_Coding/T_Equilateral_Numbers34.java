package interview_Coding;

import java.util.*;
class T_Equilateral_Numbers34{
    public static void main(String[] args)
    {                                                                                                   
        int n=6;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
