package interview_Coding;

public class SwappingOfTwoNmbrs1 {

	public static void main(String[] args) {
		// 1,Using with third variable
		int a=10;
		int b=20;
		/*int c;     //declares a temporary variable c
		System.out.println("Numbers Before Swapping      "+a+"   "+b); //10 20
		c=a;   //stores the value of a in c.
		a=b;  //assigns the value of b to a
		b=c;  //assigns the value stored in c
		System.out.println("Numbers After Before Swapping      "+a+"   "+b); //20 10*/
		// 2,Swapping of two numbers without using third variable
		/*a=a+b; //30
		b=a-b; //10
		a=a-b; //20
		System.out.println("Numbers After  Swapping      "+a+"   "+b); //20 10*/

		// 3,Swapping of two numbers without using third variable
		b=a+b-(a=b);
		System.out.println("Swapping of two Number without using third variable    "+a+"    "+b); // 20 10

	}

}
