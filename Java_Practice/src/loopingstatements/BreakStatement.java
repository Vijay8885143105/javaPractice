package loopingstatements;

public class BreakStatement {

	public static void main(String[] args) {
		for (int i = 1; i <=6; i++) {
			if (i==4) {
				break;     //Break means it will completely comes out from the loop
			}
			System.out.println(i);    //  1 2 3 
		}
	}
}

