package inheritance;

class Z
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}
class W extends Z  //through inheritance
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}

class C extends W
{
	int p;
	int q;
	public void addition()
	{
		System.out.println(p+q);
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		/*Z zobj=new Z();
		zobj.a=100;
		zobj.b=200;
		zobj.display();

		W wobj=new W();
		wobj.x=200;
		wobj.y=200;
		wobj.show();

		wobj.a=5000;
		wobj.b=3000;
		wobj.display();*/

		C cobj=new C();
		cobj.a=100;
		cobj.b=100;
		cobj.x=100;
		cobj.y=100;
		cobj.p=100;
		cobj.q=100;
		cobj.display();
		cobj.show();
		cobj.addition();






	}

}
