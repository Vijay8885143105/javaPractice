package interfaces1;
//final class test  
class test
{
	final int a=100;
	final void m1()
	{
		// a=200;  // not allowed ,If we put final keyword in front of variable ,value is fixed.cannot be changed.
		System.out.println(a);
	}
}
class test123 extends test   //not allowed , if we put final keyword in front class name
{
	//void m1()  //not allowed , because m1 is final method
	{
		System.out.println("Method m1 is overridden");
	}
}

public class Testt {

	public static void main(String[] args) {


	}

}
