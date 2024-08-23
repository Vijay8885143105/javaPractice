package interfaces;
class  test{
	//if we specify final keyword in front of class
	//then we cannot extend this parent class to child class 
	final int a=10;
	final  void m1()
	{
		//a=20; //Not valid  because a is final variable 
		System.out.println(a);
	}
}
class test123 extends test{ //Not valid because class is final

	/*void  m1() {  //Not valid because m1 is final method
	 * 
		System.out.println("m1 is overridden");
	}*/
}

public class FinalExample {

	public static void main(String[] args) {


	}

}
