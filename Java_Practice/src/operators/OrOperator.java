package operators;

import java.util.Scanner;

public class OrOperator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for (int i = 1; i <=5; i++) {
			System.out.println("Enter Digit ");
			int b =input.nextInt();
			if ((b>24)||(b<11)) {
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}

	}
}
