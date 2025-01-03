package interview_Coding;

public class FibonacciSeries10 {

	public static void main(String[] args) {
         //0  1  1  2  3  5  8  13  21  34 
		//Fibonacci series (Fibonacci sequence) is a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. 
		//fibonaci series typically starts with 0 and 1. 
		int n1=0,n2=1,sum=0;
		System.out.println(n1+"         "+n2);    // 0 1   Print the first two Fibonacci numbers
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;     // Calculate the next Fibonacci number
			System.out.println("       "+sum);  // Print the next Fibonacci number
			n1=n2;  //Update n1 to the next number in the series
			n2=sum; //Update n2 to the next number in the series
		}
	}

}
