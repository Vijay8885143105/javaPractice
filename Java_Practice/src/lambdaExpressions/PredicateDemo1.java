package lambdaExpressions;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		//Example1:
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(25));   //true
		System.out.println(p.test(17));  //true
		System.out.println(p.test(9));  //false

		// Example 2:     Check the length of the given string is greater then 4  or not
		Predicate<String> pr=s->s.length()>4;
		System.out.println(pr.test("Vijay"));  //true
		System.out.println(pr.test("Vasavi")); //true
		System.out.println(pr.test("Tej"));   //false

		//Example 3:   Print Array elements greater then the 4 from the array
		String names[]= {"Mani","Vani","Kiran","Jay","Kan"};
		for(String N:names)
		{
			/*if (pr.test(N)) {                 //This is the best way to do
			System.out.println(N);    //Kiran
		}*/
			if (N.length()>4) {                       //if we have 10 conditions , complexity  rise
				System.out.println(N);        //Kiran
			}

		}

	}


}



