package accessmodifiers_A;
class K
{
	protected int a=3000;
	protected void  p1()
	{
		System.out.println(a);
	}
}
public class Protected  {

	public static void main(String[] args) {
		K kobj=new K();
		kobj.a=30016;
		System.out.println(kobj.a);  //30016

	}

}
