package inheritance2;
//Single inheritance
class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a*b);    //20000
	}
}
	class B extends A
	{
		int x;
		int y;
		public void show()
		{
			System.out.println(x*y);    //200
	}
	}
public class SingleInheritance {

	public static void main(String[] args) {
		/*A aobj=new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();*/
		B bobj =new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		bobj.a=111;      //we can maintain same variables ,different values
		bobj.b=1111;
		bobj.display();   //123321
	
	}

}
