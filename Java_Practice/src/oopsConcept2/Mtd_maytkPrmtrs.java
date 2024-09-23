package oopsConcept2;

public class Mtd_maytkPrmtrs {
	int a;
	int b;
	void sum(int x,int y)      //method takes parameters
	{
		a=x;
		b=y;
		System.out.println(a+b);   //1000
	}
	public static void main(String[] args) {
		Mtd_maytkPrmtrs m=new Mtd_maytkPrmtrs();
		m.sum(500, 500);
	}

}
