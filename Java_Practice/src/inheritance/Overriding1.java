package inheritance;
class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
class Bike extends vehicle
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.run();
		Bike b=new Bike();
		b.run();




	}

}
