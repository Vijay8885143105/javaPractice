package interview_Coding;

public class Prime_numbers_1_200between_49 {

	public static void main(String[] args) {
		// Loop through numbers from 2 to 100       //39 49
        for (int num = 2; num <= 100; num++) 
        {
            int count = 0;  //keep track of how many divisors the number (num) has.

            // Check how many divisors num has
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                {
                    count++;  // Increment if divisible
                }
            }

            // Prime numbers have exactly two divisors: 1 and itself
            if (count == 2) 
            {
                System.out.println(num + " is a prime number.");
            }
        }
	}

}
