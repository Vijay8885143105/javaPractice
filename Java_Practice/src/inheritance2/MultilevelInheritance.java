package inheritance2;
//Multilevel Inheritance
class D
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a*b);    //20000
	}
}
	class E extends D
	{
		int x;
		int y;
		public void show()
		{
			System.out.println(x*y);    //200
	}
	}
	class F extends E
	{
		int p;
		int q;
		public void addition()
		{
			System.out.println(p+q);
		}
	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		F cobj =new F();
		cobj.x=10;
		cobj.y=20;
		cobj.show();   //200
		cobj.a=111;      //we can maintain same variables ,different values
		cobj.b=1111;
		cobj.display();   //123321
		cobj.p=1000;
		cobj.q=2000;
		cobj.addition();  //3000
	}

}
