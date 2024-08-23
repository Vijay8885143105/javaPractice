package arrays;

public class TwoDimentionObjectArray {

	public static void main(String[] args) {
		Object a[][]=new Object[3][2];
		a[0][0]=10;//int
		a[0][1]=10.34;//float
		a[1][0]="I am learning java";//string
		a[1][1]='C';//char
		a[2][0]=true;//boolean
		a[2][1]="This is the end";//string
		for (Object[] F : a) {
			for (Object[] G : a) {
				System.out.println(G);
			}
		}
		


	}

}
