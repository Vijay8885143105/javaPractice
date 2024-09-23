package interfaces1;
interface Example
{
	int a=10;   //static & final variable
	void display();   //abstract method ,public access modifier
}
public class InterfaceExample  implements Example{
	public void display()
	{
		System.out.println(a);  //10
	}
	public static void main(String[] args) {
		Example e=new InterfaceExample();
		e.display();
	}
}
