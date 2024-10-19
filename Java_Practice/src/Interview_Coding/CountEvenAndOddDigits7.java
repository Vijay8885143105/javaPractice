package Interview_Coding;

public class CountEvenAndOddDigits7 {

	public static void main(String[] args) {
		int num=123456;
		int   even_count=0;
		int odd_count=0;
		while (num>0) {
			int	rem=num%10;
			if (rem%2==0) {
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even_numbers  "+even_count);
		System.out.println("Number of odd_numbers  "+odd_count);
	}
}
