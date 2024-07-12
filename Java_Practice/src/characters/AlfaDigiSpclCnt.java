package characters;

import java.util.Scanner;

public class AlfaDigiSpclCnt {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String str=input.nextLine();
		int strlen =str.length();
		System.out.println("string Length:::::::::"+strlen);
		int AlfaCount=0;
		int digiCount=0;
		int SpecialCount=0;
		for (int i = 0; i <strlen ; i++) {
			char c=str.charAt(i);
			if (Character.isLetter(c)) {
				AlfaCount++;
			}
			else if (Character.isDigit(c)) {
				digiCount++;					
			}
			else
			{
				SpecialCount++;
			}
			

		}
		System.out.println("AlfaCount::::"+AlfaCount);
		System.out.println("digiCount::::"+digiCount);
		System.out.println("SpecialCount::::"+SpecialCount);



	}

}
