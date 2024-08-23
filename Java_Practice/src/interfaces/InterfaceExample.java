package interfaces;
interface Testinter{
	
	int a=10;  //By default it is static and final variable
	void display();  //Abstract method
	
}
public class InterfaceExample  implements  Testinter{
	public void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		InterfaceExample ie=new InterfaceExample();
		ie.display();

	}

}
