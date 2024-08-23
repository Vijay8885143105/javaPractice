package oopsConcept;

public class MethodOverLoading {
	int a;
	int b;
	void sum() //First method
	{
		a=100;
		b=200;
		System.out.println(a+b);
	}

	void sum(int x ,int y) //Second method
	{
		int a=x;
		int b=y;
		System.out.println(x+y);
	}

	void sum(int x,int y,int z) //Third method
	{
		System.out.println(x+y+z);
	}

	void sum (int x,double y) //Fourth method
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {   //Main method
		MethodOverLoading mo=new MethodOverLoading();
		mo.sum(); //Call first method
		mo.sum(200, 200); //Call second method
		mo.sum(100, 500, 100); //Call third method
		mo.sum(100, 100.25); //Call fourth method

	}

}
