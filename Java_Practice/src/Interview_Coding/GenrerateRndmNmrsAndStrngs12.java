package Interview_Coding;

import java.util.Random;

public class GenrerateRndmNmrsAndStrngs12 {

	public static void main(String[] args) {
		//Approach 1
		Random rand=new Random();      //Random is a class
		/*int rand_int =rand.nextInt(999);  //Maximum limit is 999
		System.out.println(rand_int);
		Double	rand_Double=rand.nextDouble();
		System.out.println(rand_Double);*/

		//Approach 2
		System.out.println(Math.random());    //Math is a Class ,Need not to Create a Object
	}
}
