package accessmodifiers_A;
class A
{
	public int a=10;       //variable accessible everywhere
	public void m1()    //method accessible everywhere
	{
		System.out.println(a);
	}
}
public class Public {
	public static void main(String[] args) {
		A aobj=new A();
		aobj.a=1000;
		System.out.println(aobj.a);  //1000
		aobj.m1();  //1000    //invoked through method name

	}

}
