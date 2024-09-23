package accessmodifiers_B;
class K
{
	protected int a=3000;
	protected void  p1()
	{
		System.out.println(a);
	}
}
public class Protected1  extends K {

	public static void main(String[] args) {
		Protected1 p2=new Protected1();
		p2.a=30166;
		System.out.println(p2.a); //30166
	//p2.p1();     //3000

	}

}
