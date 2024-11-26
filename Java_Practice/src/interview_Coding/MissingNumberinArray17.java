package interview_Coding;

public class MissingNumberinArray17 {

	public static void main(String[] args) {
		//Array should not have duplicates  *
		//Array no need to be in sorted order
		//Values should be in range
		int a[]= {1,2,3,5,6};
		//sum1=1+2+3+5+6=17
		//sum2=1+2+3+4+5+6=21
		//sum2-sum1=21-17=4=missing number
		int 	sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array are    "+sum1);
		int sum2=0;
		for (int i = 1; i <=6; i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array are    "+sum2);
		System.out.println("Missing number in array is      "+(sum2-sum1));
	}

}
