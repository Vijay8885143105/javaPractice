package interview_Coding;

public class NearestTO100Num_56 {

	public static void main(String[] args) {
		
		 int a[] = {12, 5, 87, 32, 15, 98, 105, 124};
	        int nearest = a[0], target = 100;      //Initially, we assume the first element (12) is the nearest.
	        
	        	//Math.abs(n - target) → difference between current number n and 100.
	        	//Math.abs(nearest - target) → difference between nearest number so far and 100.
	              for (int n : a)                                          //n takes each element of the array one by one.
	              {
	            if (Math.abs(n - target) < Math.abs(nearest - target))
	            {
	                nearest = n;                                       //If the current number n is closer to 100, then we update nearest.      
	            }
	              }
	        System.out.println("Nearest number to 100 is: " + nearest);
	        System.out.println("========================================================================================");
	        //Using StringBuilder class
	        
	        /* String str="hello master 234567  vijji hello ra &^%$ ";
        StringBuilder digits=new StringBuilder();
        for(char ch: str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                digits.append(ch);
            }
        }
        System.out.println(digits);*/
	        
	        //Using regex
	        
	        /* String str="hello master 234567  vijji hello ra &^%$ ";
       String digits=str.replaceAll("[^0-9]","");
       System.out.println(digits);*/
	}
}
