package arrays;

public class Objectarray {

	public static void main(String[] args) {
		Object a[]=new Object[7];
		a[0]=24; //integer
		a[1]=24.45; //float
		a[2]='d'; //char
		a[3]='@'; //char
		a[4]='5'; //char
		a[5]="this is the string"; //string
		a[6]=true; //boolean
		for (Object F : a) {
			System.out.println(F);
		}
		





	}

}
