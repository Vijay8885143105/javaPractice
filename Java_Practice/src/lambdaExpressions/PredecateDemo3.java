package lambdaExpressions;
//Joining predicates      and , or , negate
//p1...Check number is even
//p2.....Check number is greater then 50

import java.util.function.Predicate;

public class PredecateDemo3 {

	public static void main(String[] args) {
		int a[]= {15,20,36,50,59,60};
		Predicate<Integer>p1=i->(i%2==0);
		Predicate<Integer>p2=i->(i>50);
		/*   for (int Wish : a) {
			//if (p1.test(Wish)&&p2.test(Wish))
        	 if (p1.and(p2).test(Wish)) {
 				System.out.println(Wish);    //60
			}

		}
         for (int Wish : a) {
			if (p1.test(Wish)&&p2.test(Wish))
        	 if (p1.or(p2).test(Wish)) {
 				System.out.println(Wish);    //20, 36, 50, 59, 60
			}

		}*/
		for (int Wish : a) {
			if (p1.negate().test(Wish)) {		
				System.out.println(Wish);   //15, 59
			} 			
		}
	}
}
