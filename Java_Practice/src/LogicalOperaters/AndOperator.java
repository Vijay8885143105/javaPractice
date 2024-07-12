package LogicalOperaters;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		if ((a>0)&&(a<100)) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");

	}

}
}