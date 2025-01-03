package interview_Coding;

import java.util.Random;

public class GenrerateRndmNmrsAndStrngs12 {

	public static void main(String[] args) {
		//Approach 1
		Random rand=new Random();      //Random is a class
		//Generates a random integer between 0 and 998.
		//generates a random integer between 0 (inclusive) and 999 (exclusive).
		/*int rand_int =rand.nextInt(999);  //Maximum limit is 999
		System.out.println(rand_int);
		// Generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
		Double	rand_Double=rand.nextDouble();
		System.out.println(rand_Double);*/

		//Approach 2
		System.out.println(Math.random());    //Math is a Utility  Class ,Need not to Create a Object
	}
}
