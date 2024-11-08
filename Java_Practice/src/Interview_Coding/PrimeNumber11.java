package Interview_Coding;

public class PrimeNumber11 {

	public static void main(String[] args) {
		int num=5;
		int     count=0;	
		if (num>1) 
		{
			for (int i = 1; i <=num; i++)
			{
				if (num%i==0) {
					count++;
				}
				if (count==2)
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
