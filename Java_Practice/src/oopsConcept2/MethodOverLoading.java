package oopsConcept2;

public class MethodOverLoading {
	int a;
	int b;
	void sum()  //First method
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int a,int b)  //Second method
	{
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)  //Third method
	{
		System.out.println(x+y+z);
	}
	void sum(int a,double b)  //Fourth method
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		//Call the methods based on (numbers of parameters,Order of parameters,data type of parameters)
		mo.sum(); //30
		mo.sum(100, 200);  //300
		mo.sum(10, 20, 30);  //60
		mo.sum(10, 10.25);  //20.25

	}

}
