package arrays;

public class StoreUnlmtdElmnts {

	public static void main(String[] args) {
		int i[]= {100,200,300,400,500,600,700,800,900};   //We can store Unlimited elements in to array
		int sum=0;
		//Read elements from the array
		for (int j : i) {
			System.out.println(j);
			sum =sum+j;
		}
		System.out.println(sum);

	}

}
