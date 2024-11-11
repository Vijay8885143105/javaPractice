package interview_Coding;

public class FactorialOfNumber13 {

	public static void main(String[] args) {
		//5!=1*2*3*4*5=120
		int num=5;
		long facotorial=1;
		/* for (int i = 1; i <=5; i++) {
                	facotorial=facotorial*i; //1 2 6 24 120
				}
            	System.out.println("Facotorial of number  "+facotorial);*/
		for (int i = 5; i >=1; i--) {
			facotorial=facotorial*i;
		}
		System.out.println("Factorial of a number     "+facotorial);
	}
}
