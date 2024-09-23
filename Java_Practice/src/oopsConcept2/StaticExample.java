package oopsConcept2;

public class StaticExample {
	int a;  //non static variable
	static int b; //static variable
	static void m1()  //static method
	{
		System.out.println("This is m1-static method");
	}
	void m2() //non static mehod
	{
		System.out.println("This is m2-Non static method");
	}
	void m3() //non static method
	{
		System.out.println("This is m3-Non static method");
		a=100; //non static variable
		b=200; //static variable
	}

	public static void main(String[] args) {
		b=111;   //static variable
		System.out.println(b);    //111    This is m1-static method
		m1();
		/*a=123;      Not accessible because it is non static variable
		/System.out.println(a);
		 m2();*/
		StaticExample se=new StaticExample();
		se.a=123;                //non static variable
		System.out.println(se.a);  //123 //This is m2-Non static method
		se.m2();   

		se.a=100;              //non static variable
		System.out.println(se.a);

		b=200;                //static variable
		System.out.println(se.b);

		se.a=1000;        //non static variable
		System.out.println(se.a);   //1000 This is m3-Non static method
		se.m3();


	}

}
