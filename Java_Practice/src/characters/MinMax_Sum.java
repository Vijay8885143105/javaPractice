package characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinMax_Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(str);
		String[] strArr = str.split(",");
		System.out.println(Arrays.toString(strArr));
		ArrayList<Integer> intArrList = new ArrayList<>();
		for (String num : strArr) {
			int n = Integer.parseInt(num);
			intArrList.add(n);
		}

		int largest = intArrList.get(0);
		for (Integer n : intArrList) {
			if(n>largest) {
				largest = n;
			}
		}

		System.out.println("Largest Num : " + largest);

		int smallest = intArrList.get(0);
		for (Integer n : intArrList) {
			if(n<smallest) {
				smallest = n;
			}
		}

		System.out.println("Smallest Num : " + smallest);
		int sum = largest + smallest;
		System.out.println("Sum of Largest and Smallest Num : " + sum);

		input.close();
	}



}

