package interview_Coding;

public class Unique_emnt_wtOut_Collectns_54 {
	
	    public static void main(String[] args) {
	        int a[] = {22, 34, 56, 77, 34, 32, 32};

	        for (int i = 0; i < a.length; i++)
	        {
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++)
	            {
	                // If the element appeared before, it is not unique
	                if (a[i] == a[j]) 
	                {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (isUnique)
	            {
	                System.out.println(a[i]);
	            }
	        }
	    }
	}



