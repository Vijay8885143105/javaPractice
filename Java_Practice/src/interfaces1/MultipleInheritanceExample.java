package interfaces1;
//Multiple inheritance is possible through the interfaces concept only
interface A
{
	int a=10;   //static & final variable
	void display();  //abstract method
}
interface B
{
	int b=20;  //static & final variable
	void show(); //abstract method
}
public class MultipleInheritanceExample implements A,B 
{
	public void display()
	{
		System.out.println(a);  //10
	}
	public void show()
	{
		System.out.println(b); //20
	}
	public static void main(String[] args) {
		MultipleInheritanceExample mi=new MultipleInheritanceExample();
		mi.display();
		mi.show(); 
	}

}
