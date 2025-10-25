package interview_Coding;

public class BinarySearchElement21 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};  //should be in sorted order
		int key=40;
		boolean flag=false;
		int l=0;   //Initialize lower bound
		int h=a.length-1; //Initialize upper bound
		while (l<=h) {
			int m=(l+h)/2;  //Calculate the middle index
			if (a[m]==key) {    //Check if the middle element is the key
				System.out.println("Element found::"+key);
				flag=true;
				break;
			}
			//If the middle element is less than the key, search in the right half
			if (a[m]<key) {
				l=m+1;
			}
			//If the middle element is greater than the key, search in the left half
			if (a[m]>key) {
				h=m-1;
			}
		}
		if (flag==false) {
			System.out.println("Element not found");
		}
	}

}
