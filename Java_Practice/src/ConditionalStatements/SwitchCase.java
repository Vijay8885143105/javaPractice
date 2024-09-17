package ConditionalStatements;

public  class SwitchCase {

	public static void main(String[] args) {
		//Switch Case condition is mainly reducing the code compare with the nested if condition
		//int day=9;    //Sunday
		int day=5;        //Friday
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;   //Friday
		case 6: System.out.println("Saturday"); break;
		default: System.out.println("Sunday");
		}

	}

}
