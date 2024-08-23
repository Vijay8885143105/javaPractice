package inheritance;


class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}
class B extends A  //through inheritance
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}
public class SngleInheritance{

	public static void main(String[] args) {
   /* A aobj=new A();
    aobj.a=100;
    aobj.b=200;
    aobj.display();*/
    
    B bobj=new B();
    bobj.x=200;
    bobj.y=200;
    bobj.show();
    
    bobj.a=5000;
    bobj.b=3000;
    bobj.display();

	}

}
