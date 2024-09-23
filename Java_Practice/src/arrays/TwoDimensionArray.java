package arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		//Classic for loop
		//for incrementing the rows
		for (int i = 0; i <=2; i++) {    //row size starts from  0 index number and column size starts from 0 index number
			//Classic for loop
			//for incrementing the columns
			for (int j = 0; j <=1; j++) {
				System.out.println(a[i][j]);
				//System.out.print(a[i][j]);         //102030405060
			}
		}
		
		}

	}


