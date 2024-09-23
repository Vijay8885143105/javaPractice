package oopsConcept2;

public class ConstructorOverLoading {
	int a=0;
	int b=0;
	double c=0;
	ConstructorOverLoading()  //First
	{
		a=10;  //Here a,b,c local parameters
		b=20;
		c=20.34;
	}

	ConstructorOverLoading(int x,int y)  //Second
	{
		a=x;     //Here a,b are class variables and x,y are external variables
		b=y;
	}
	ConstructorOverLoading(int x,double y)  //Third
	{
		a=x;
		c=y;
	}
	ConstructorOverLoading(int x,int y,double z)  //Fourth
	{
		a=x;
		b=y;
		c=z;
	}
	ConstructorOverLoading(int x,double y,int z)  //Fifth
	{
		a=x;
		b=z;
		c=y;	
	}
	ConstructorOverLoading(int a,int b,int c)  //Sixth
	{
		//this key word is used for identification of the global variable of the current class
		this.a=a;
		this.b=b;
		this.c=c;	
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		//ConstructorOverLoading co=new ConstructorOverLoading();    //10,20,20.34
		//ConstructorOverLoading co=new ConstructorOverLoading(100, 200);  //100,200,0.0
		//ConstructorOverLoading co=new ConstructorOverLoading(20, 30.34); //External parameters (20,0,30.34)
		//ConstructorOverLoading co=new ConstructorOverLoading(10, 20, 60.66);  //10,20,60.66
		//ConstructorOverLoading co=new ConstructorOverLoading(500, 40.80, 1000);  //500 ,1000,40.8
		ConstructorOverLoading co=new ConstructorOverLoading(100, 100, 100);  //100,100,100.0  
		co.display();
	}

}
