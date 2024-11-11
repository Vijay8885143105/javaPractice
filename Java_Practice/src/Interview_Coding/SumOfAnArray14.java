package Interview_Coding;

public class SumOfAnArray14 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int  sum= 0;
		/*for (int i = 0; i <= a.length-1; i++) {
				sum =sum+a[i];
			}
              System.out.println("Sum of elements in array   "+sum);*/
		for (int value : a) {
			sum=sum+value;
		}
		System.out.println("Sum of elements in array  "+sum);
	}

}
