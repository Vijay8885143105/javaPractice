package interview_Coding;

public class PrimeNumber11 {

	public static void main(String[] args) {
		int num=11;    //num is the number you want to check.
		int     count=0;	  //count is used to count the number of divisors of num.
		if (num>1)     //Prime numbers are greater than 1.
		{ 
			for (int i = 1; i <=num; i++)
			{
				if (num%i==0) {   //If num is divisible by i, count is incremented.
					count++; 
				}
				if (count==2)  //A prime number has exactly two divisors: 1 and itself.
				{
					System.out.println("Given number is prime number "+num);
				}
			}
		}
		else 
		{
		System.out.println("Given number is Not Prime number");
		}
	}
}
