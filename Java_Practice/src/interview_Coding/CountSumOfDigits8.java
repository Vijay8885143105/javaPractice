package interview_Coding;

public class CountSumOfDigits8 {

	public static void main(String[] args) {
		int num=123456;
		int 	sum=0;
		// Loop to extract and add each digit of num to sum
		while (num>0) {
			sum=sum+num%10;  // Add the last digit of num to sum
			num=num/10;             //Remove the last digit from num
			//The loop exits because num is now 0. 
		}
		System.out.println(sum);
	}
}
