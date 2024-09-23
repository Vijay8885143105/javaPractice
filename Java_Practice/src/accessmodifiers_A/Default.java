package accessmodifiers_A;
class D
{
	int a=123;
	void d1()
	{
		System.out.println(a);
	}
}
public class Default {

	public static void main(String[] args) {
		D dobj=new D();
		//dobj.a=1233;
		//System.out.println(dobj.a); //1233
		dobj.d1();    //123


	}

}
