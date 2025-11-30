package interview_Coding;

public class Unique_emnt_wtOut_Collectns_54 {
	
	    public static void main(String[] args) 
	    {
	    	//Remove the duplicates without using HashSet
	       /* int a[] = {10, 20, 30, 30, 40, 40};
	       for (int i = 0; i < a.length; i++)
	        {
	            boolean flag = true;   // assume element is unique

	            for (int j = 0; j < i; j++)
	            {
	                if (a[i] == a[j])
	                {
	                    flag = false;  // element already appeared
	                    break;
	                }
	            }

	            if (flag==true)
	            {
	                System.out.println(a[i]);
	            }
	        }*/
	    	    	
	    	//Print the Unique elements in the array
	    	int a[] = {10, 20, 30, 30, 40, 40};
	        System.out.println("Unique elements:");
	        for (int i = 0; i < a.length; i++) {
	            int count = 0;
	            // count how many times a[i] appears
	            for (int j = 0; j < a.length; j++)
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



