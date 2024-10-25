package Interview_Coding;

public class LinearSearchElement20 {

	public static void main(String[] args) {
          int a[]= {10,20,30,60,80,248};
          int search_element=80;
          boolean flag=false;
          for(int i=0;i<a.length;i++)
          {
        	  //System.out.println(a[i]);
        	  if (a[i]==search_element) {
				System.out.println("Element found at position "+i);
				flag=true;
			}
          }
          if (flag==false) {
			System.out.println("Element not found");
		}
	}

}
