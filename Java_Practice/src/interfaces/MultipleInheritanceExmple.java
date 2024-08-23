package interfaces;
interface A{
	int a=10;
	void display();	
}

interface B{
	int b=20;
	void show();
}

public class MultipleInheritanceExmple implements A,B {
	public void display()
	{
		System.out.println(a);
	}
	public void show()
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		MultipleInheritanceExmple mi=new MultipleInheritanceExmple();
		mi.display();
		mi.show();

	}

}
