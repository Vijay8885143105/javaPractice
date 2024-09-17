package oopsConcept1;

public class Practice {
	int a;
	int b;
	void sum() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Practice   cal=new Practice();
		cal.a=1000;
		cal.b=2000;
		cal.sum();

	}

}
