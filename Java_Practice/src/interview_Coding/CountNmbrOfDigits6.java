package interview_Coding;

public class CountNmbrOfDigits6 {

	public static void main(String[] args) {
		int num=12345;
		int count=0;   //Initialize digit count to zero
		// Loop to count digits
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in the Number  "+count);
	}

}
