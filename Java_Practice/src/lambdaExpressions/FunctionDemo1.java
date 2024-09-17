package lambdaExpressions;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f=n->n*n;  //Two arguments    i/p type(0r)Parameter type , o/p type(or)Return type
		System.out.println(f.apply(2));   //4
		System.out.println(f.apply(4));   //16
		System.out.println(f.apply(6));    //36
		System.out.println(f.apply(19));  //361
		
System.out.println("=======================================");

		//String length
		Function<String, Integer> fn=s->s.length(); //Two arguments   i/p type(0r)Parameter type , o/p type(or)Return type
		System.out.println(fn.apply("Vijay"));  //5
		System.out.println(fn.apply("Dhoni"));   //5
		System.out.println(fn.apply("Virat"));       //5
		System.out.println(fn.apply("HarbajanSing"));   //12



	}

}
