package interview_Coding;

public class BinarySearchElement21 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};  //should be in sorted order
		int key=40;
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		while (l<=h) {
			int m=(l+h)/2;
			if (a[m]==key) {
				System.out.println("Element found");
				flag=true;
				break;
			}
			if (a[m]<key) {
				l=m+1;
			}
			if (a[m]>key) {
				h=m-1;
			}
		}
		if (flag==false) {
			System.out.println("Element not found");
		}
	}

}
