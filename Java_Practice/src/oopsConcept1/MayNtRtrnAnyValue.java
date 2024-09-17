package oopsConcept1;

public class MayNtRtrnAnyValue {
	int a;
	int b;
	void sum() {
		System.out.println(a+b);
	}	
	public static void main(String[] args) {
		MayNtRtrnAnyValue Ob=new MayNtRtrnAnyValue();
		Ob.a=100;
		Ob.b=200;
		Ob.sum();

	}

}


