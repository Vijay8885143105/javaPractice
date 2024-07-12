package First_JavaClass;

import java.util.Scanner;

public class Additionj {

	public static void main(String[] args) {
		//Addition of numbers
		Scanner input=new Scanner(System.in);
		int a =input.nextInt();
		String addition_operator=input.next();
		int b=input.nextInt();
		if (addition_operator.equals("+")) {
			int c=a+b;
			System.out.println(c);
		}
		else
		{
			System.out.println("CONDITION:::::::WE CAN PROCESS ONLY + OPERATOR");
			
		}

	}

}
