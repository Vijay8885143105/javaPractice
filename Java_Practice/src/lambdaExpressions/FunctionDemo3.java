package lambdaExpressions;

import java.util.function.*;

public class FunctionDemo3 {

	public static void main(String[] args) {
		//Function chaining
		//andThen()
		//compose()
		
		Function<Integer,Integer>f1=n->n*2;      //4    ////Two arguments    i/p type(0r)Parameter type , o/p type(or)Return type
		Function<Integer,Integer>f2=n->n*n*n;   //64
		System.out.println(f1.andThen(f2).apply(2)); 
		System.out.println(f1.compose(f2).apply(2));     //16 

		
	}

}
