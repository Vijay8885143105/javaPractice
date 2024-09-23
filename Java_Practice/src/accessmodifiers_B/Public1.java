package accessmodifiers_B;
class A
{
	public int a=102;       //variable accessible everywhere
	public void m1()    //method accessible everywhere
	{
		System.out.println(a);
	}
}
public class Public1 {

	public static void main(String[] args) {
		A pp=new A();
		pp.m1();
		
		

	}

}
