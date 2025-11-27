package interview_Coding;

public class Unique_emnt_wtOut_Collectns_54 {
	
	    public static void main(String[] args) 
	    {
	        int a[] = {22, 34, 56, 77, 34, 32, 32};
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
	        }
	    }
	}



