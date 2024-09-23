package oopsConcept2;

public class Mtd_mayNtkPrmtrs {
	int a;
	int b;
	void sum()    //method may not take parameters (or) empty parameters
	{
		System.out.println(a+b);  //300
	}
	public static void main(String[] args) {
		Mtd_mayNtkPrmtrs m=new Mtd_mayNtkPrmtrs();
		m.a=100;
		m.b=200;
		m.sum();
	}

}
