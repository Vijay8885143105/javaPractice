package lambdaExpressions;

import java.util.function.Consumer;

public class ConsumerDemo3 {

	public static void main(String[] args) {
		//Consumer chaining
		Consumer<String>c1=s->System.out.println(s+"    "+"is   white");
		Consumer<String>c2=s->System.out.println(s+"     "+"is  having   four  legs");
		Consumer<String>c3=s->System.out.println(s+"     "+"is   having   four  legs");
		/*c1.accept("Cow");
	       c2.accept("Cow");
	       c3.accept("Cow");*/
  
		//OR
		//c1.andThen(c2).andThen(c3).accept("Cow");

		//OR
	Consumer<String>c4=c1.andThen(c2).andThen(c3);
	c4.accept("Cow");



	}

}
