package interview_Coding;

import java.util.*;
class Dupplicates_RemovinginArray19{
    public static void main(String[] args)
    {
      /*  int arr[]={1,2,3,4,1,2,3,8,9,7,5};
        int newlength=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean isDuplicate=false;
            for(int j=0;j<newlength;j++)
            {         
                    if(arr[i]==arr[j])
                    {
                        isDuplicate=true;
                        break;
                    }
                }
                if(!isDuplicate)
                {
                    arr[newlength++]=arr[i];
                }          
        }
        System.out.println("Array after removing duplicates..");
        for(int i=0;i<newlength;i++)
        {
            System.out.println(arr[i]+" ");
        }*/
    	
              int[] arr = {1, 2, 3, 4, 4, 5, 2, 6};
    	        // Use HashSet to remove duplicates
    	        HashSet<Integer> set = new HashSet<>();
    	        for (int num : arr) {
    	            set.add(num);  // HashSet removes duplicates
    	        }
    	        // Print unique elements
    	        System.out.println(set);
    	    }
    	}
   