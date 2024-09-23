package inheritance2;
//Overriding possible when inheritance came into   the picture
class Bike
{
	void Run()
	{
		System.out.println("Bike is Running");
	}
}
class Car extends Bike
{
	void Run()
	{
		System.out.println("Car is Running");
	}
}
public class Methodoverriding1 {

	public static void main(String[] args) {
		Bike bobj=new Bike();
		bobj.Run();
		Car cobj=new Car();
		cobj.Run();

	}
}
