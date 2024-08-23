package oopsConcept;

public class StaticExample {
	int a; //Non static variable
	static int b; //Static variable
	
	static void m1() { //static method
		System.out.println("This is m1-static method");
	}
	void m2()//Non static method
	{
		System.out.println("This is m2-Non static method");
	}

	void m3()//Non static method
	{
		a=100; //Non static variable
		b=200; //Static variable
		m1();
		m2();
	}

	
	public static void main(String[] args) {
		b=224; //Static methods access static stuff only
		System.out.println(b);
		m1();
		//a=234; //Not accessible because it is non static variable
		//System.out.println(a);
		//m2();
		StaticExample se=new StaticExample();// Static methods can access Non static stuff through creating Object
		se.a=234;
		System.out.println(se.a);
		se.m2();
		
	}
}






