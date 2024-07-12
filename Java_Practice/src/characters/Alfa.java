package characters;

import java.util.Scanner;

public class Alfa {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String str=input.nextLine();
		System.out.println(str);
		int strlen=str.length();
		System.out.println(strlen);
		int AlfaCount=0;
		int Digit=0;
		int Spl=0;
		for (int i = 0; i <strlen; i++) {
			Character c=str.charAt(i);
			if (Character.isLetter(c)) {
				AlfaCount++;			
			}
			else if (Character.isDigit(c)) {
				Digit++;				
			}
			else
			{
				Spl++;	
			}
		}
		System.out.println(AlfaCount);
		System.out.println(Digit);
		System.out.println(Spl);



	}
}

