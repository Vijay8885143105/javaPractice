package interview_Coding;

public class CountEvenAndOddDigits7 {

	public static void main(String[] args) {
		int num=123456;
		int   even_count=0;
		int odd_count=0;
		while (num>0) {
			int	rem=num%10;
			if (rem%2==0) {
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even_numbers  "+even_count);
		System.out.println("Number of odd_numbers  "+odd_count);
		
		//Print alternative odd numbers
		/*int a[] = {1,2,3,4,5,6,7,8,9};       (OR)      int a[]={1,3,5,7,9,11,13};
               int count = 0;
         for (int num : a)
          {
             if (num % 2 != 0)   // odd number check
             {         
            if (count % 2 == 0)  // alternate odd print
            {   
            System.out.println(num);                     // 1,5,9
           }
               count++;
           }       
            }*/
		
           //Print alternative even numbers                                                           
		/*int a[]={1,2,3,4,5,6,7,8,9};    here is the 2 first index at 0 ,4 is the second  index at 1
        int count = 0;
        for(int num : a) {
            if(num % 2 == 0) {     // even number
                if(count % 2 == 0) {  // print alternate even
                    System.out.println(num);                                 //2,6
                }
                count++;   // increase only when even*
            }
        }*/
	}
}
