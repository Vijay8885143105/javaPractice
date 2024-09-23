package oopsConcept2;

public class M_RtnsSmVlue {
	int a;
	int b;
	int sum()           //method returns some value
	{
		return (a+b);
	}
	public static void main(String[] args) {
		M_RtnsSmVlue m=new M_RtnsSmVlue();
		m.a=12;
		m.b=24;
		int a=m.sum();
		System.out.println(a);   //36

	}

}
