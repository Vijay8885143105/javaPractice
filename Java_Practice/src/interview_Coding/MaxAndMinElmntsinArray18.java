package interview_Coding;

public class MaxAndMinElmntsinArray18 {

	public static void main(String[] args) {
		/* int a[]= {10,20,30,40,50,60,70};
    int min=a[0];
    //Initialize min  with the first element of the array
    for (int i = 1; i <a.length; i++) {
    	if (a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Minimum number Array is  "+min);	*/
		int a[]= {10,20,30,40,50,60,70};
		//Initialize max with the first element of the array
		//The loop starts from the second element (i = 1) and compares each element 
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number in Array is  "+max);
	}
}
