package oopsConcept1;

public class RtrnSomeValue {
	int a;
	int b;
	int sum() {
		return a+b;

	}
	public static void main(String[] args) {
		RtrnSomeValue ob=new RtrnSomeValue();
		ob.a=100;
		ob.b=200;
		int k=ob.sum();
		System.out.println(k);


	}

}
