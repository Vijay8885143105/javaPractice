package lambdaExpressions;

import java.util.function.*;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		//accpet()
		Consumer<String> c=s->System.out.println(s);  //Takes single parameter i/p & returns nothing
		c.accept("Welcome to pre-defind functional interface::::::consumer");
	}

}
