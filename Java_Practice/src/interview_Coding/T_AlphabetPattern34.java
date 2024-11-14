package interview_Coding;

public class T_AlphabetPattern34 {

	public static void main(String[] args) {
		int alpha=65;   //65 is ASCII value of A
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(alpha+j)+" ");   //65+0=65
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		//for small alphabets
		int alpha1=97;   //97 is ASCII value of a
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(alpha1+j)+" ");   //97+0=97
			}
			System.out.println();
		}
	}
}
