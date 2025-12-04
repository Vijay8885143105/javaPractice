package interview_Coding;

public class Unique_emnt_wtOut_Collectns_54 {
	
	    public static void main(String[] args) 
	    {
	    	//Remove the duplicates without using HashSet
	       /* int a[] = {10, 20, 30, 30, 40, 40};
	       for (int i = 0; i < a.length; i++)
	        {
	            boolean flag = true;   // assume element is unique  ,We assume the current number is unique (not repeated).

	            for (int j = 0; j < i; j++)
	            {
	                if (a[i] == a[j])
	                {
	                    flag = false;  // element already appeared, this number is a duplicate.
	                    break;
	                }
	            }

	            if (flag==true)      //"This number is NOT duplicated before"
	            {
	                System.out.println(a[i]);
	            }
	        }*/
	    	    	
	    	//Print the Unique elements in the array
	    	int a[] = {10, 20, 30, 30, 40, 40};
	        System.out.println("Unique elements:");
	        for (int i = 0; i < a.length; i++) {                           //Outer loop (pick each element)
	            int count = 0;
	            // count how many times a[i] appears
	            for (int j = 0; j < a.length; j++)                       //Inner loop (compare with all elements)
	            {
	                if (a[i] == a[j]) {
	                    count++;
	                }
	            }
	            // if appears only once → unique
	            if (count == 1) {
	                System.out.println(a[i]);
	            }
	        }
	    }
	}



