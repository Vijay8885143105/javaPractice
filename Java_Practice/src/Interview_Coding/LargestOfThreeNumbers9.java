package Interview_Coding;

import java.util.Scanner;

public class LargestOfThreeNumbers9 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=scr.nextInt();
		System.out.println("Enter Second number");
		int b=scr.nextInt();
		System.out.println("Enter Third number");
		int c=scr.nextInt();
		/*if(a>b && a>c)
		{
			System.out.println("a is largest number   "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number   "+b);
		}
		else
		{
			System.out.println("c is largest number   "+c);
		}	*/
		
		//ternary operator
		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		System.out.println("Largest numer is      "+largest2);

	}
}
