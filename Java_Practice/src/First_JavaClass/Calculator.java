package First_JavaClass;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();

		String operation =input.next();

		int b=input.nextInt();

		if (operation.equals("+")) {
			int c=a+b;
			System.out.println(c);
		}
		else if (operation.equals("-")) {
			int c=a-b;
			System.out.println(c);
		} 
		else if (operation.equals("*")) {
			int c=a*b;
			System.out.println(c);
		}
		else if (operation.equals("/")) {
			int c=a/b;
			System.out.println(c);
		}
		else if (operation.equals("%")) {
			int c=a%b;
			System.out.println(c);
		}
		else {
			System.out.println("NO OPERATION");
		}









	}

}
