package interview_Coding;

public class EvenorOddNumbersFrmArray15 {

	public static void main(String[] args) {
		//The array a is initialized with values {1, 2, 3, 4, 5, 6, 7, 8, 9}.
             int a[]= {1,2,3,4,5,6,7,8,9};
             /*Extracting even numbers
             System.out.println("Even numbers are..............");
             for (int i = 0; i < a.length; i++) {
				if (a[i]%2==0) 
					System.out.println(a[i]);	
			}
             //Extracting odd numbers
             System.out.println("Odd numbers are..............");
             for (int i = 0; i < a.length; i++) {
				if (a[i]%2!=0) 
					System.out.println(a[i]);
	}*/
             //Using for each loop
             System.out.println("Even numbers are..............");
             for (int value : a) {
				if (value%2==0) 
					System.out.println(value);
			}
             System.out.println("Odd numbers are..............");
             for (int value : a) {
				if (value%2!=0) 
					System.out.println(value);            
}
}
}
