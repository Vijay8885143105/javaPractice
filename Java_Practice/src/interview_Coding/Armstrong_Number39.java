package interview_Coding;
class Armstrong_Number39
//Narcissistic number also
{
	// Method to check if a number is an Armstrong number
	public static boolean isArmstrong(int num)
	{
		int org_num=num; // Original number to compare later
		int cubed_num=0;  // To store the sum of cubes of digits
		// Loop to break down the number into digits and sum their cubes
		while(num>0)
		{
			int rem=num%10;  // Remainder when divided by 10 gives the last digit
			cubed_num=cubed_num+(rem*rem*rem);// Add the cube of the digit to cubed_num
			num=num/10; // Remove the last digit
		}
		// Compare the original number with the sum of cubes of its digits
		return org_num==cubed_num;
	}
	public static void main(String[] args)
	{
		System.out.println("Armstrong number bw 1to 200");
		// Loop to check each number from 1 to 200
		for(int num=1;num<=200;num++)
		{
			if(isArmstrong(num))
				System.out.println(num);   // Print the number if it is an Armstrong number
		}
	}
}
