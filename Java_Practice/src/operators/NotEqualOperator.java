package operators;

import java.util.Scanner;

public class NotEqualOperator {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		if (!(a>0)) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
