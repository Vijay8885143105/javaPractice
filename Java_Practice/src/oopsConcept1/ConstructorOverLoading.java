package oopsConcept1;

public class ConstructorOverLoading {
	int a=0;
	int b=0;
	double c=0;
	ConstructorOverLoading()//first constructor
	{
		a=100;
		b=200;
		c=300.25;
	}
	ConstructorOverLoading(int x,int y)//second constructor
	{
		a=x;
		b=y;
	}
	ConstructorOverLoading(int x ,double y)//third constructor
	{
		a=x;
		c=y;
	}
	ConstructorOverLoading(int x,int y,double z)//fourth constructor
	{
		a=x;
		b=y;
		c=z;		
	}
	ConstructorOverLoading(int x,double y,int z)//fifth constructor

	{
		a=x;
		b=z;
		c=y;
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}



	public static void main(String[] args) {
		//ConstructorOverLoading co=new ConstructorOverLoading();// Call first Constructor
		//ConstructorOverLoading co=new ConstructorOverLoading(10,20);// Call second Constructor
		//ConstructorOverLoading co=new ConstructorOverLoading(200,200.45);// Call third Constructor
		//ConstructorOverLoading co=new ConstructorOverLoading(200,200,41.34);// Call fourth Constructor
		ConstructorOverLoading co=new ConstructorOverLoading(100,20.56,400);// Call fifth Constructor


		co.display();



	}

}
