package oopsConcept;

public class MayNtTkPrmtrs {
	int a;
	int b;
	//Method may not takes parameters   (OR)
	void sum() {
		System.out.println(a+b);
	}	

	public static void main(String[] args) {
		MayNtTkPrmtrs addition=new MayNtTkPrmtrs();
		addition.a=100;
		addition.b=200;
		addition.sum();
		}

	}


