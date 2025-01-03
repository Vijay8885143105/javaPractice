package interview_Coding;

public class SumOfAnArray14 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int  sum= 0;   //Initialize sum to 0
		// Loop through each element in the array and add it to sum
		/*for (int i = 0; i <= a.length-1; i++) {
				sum =sum+a[i];  //In each iteration, the value of a[i] is added to sum.
			}
              System.out.println("Sum of elements in array   "+sum);*/
		for (int value : a) {
			sum=sum+value;
		}
		System.out.println("Sum of elements in array  "+sum);
	}

}
