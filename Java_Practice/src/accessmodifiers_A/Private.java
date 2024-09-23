package accessmodifiers_A;
class Z
{
	private int a=10000;
	private void m1()
	{
		System.out.println(a);
	}
}
public class Private {

	public static void main(String[] args) {
		Z aobj=new Z();
		//aobj.a=100;    Not allowed, because private modifier accessed within class only

}
}
