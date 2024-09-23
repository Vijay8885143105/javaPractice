package inheritance2;
//Overriding
//Overriding possible when inheritance came into   the picture
class Bank {
	int getRateofinterest() 
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int getRateofinterest() 
	{
		return 10;
	}
}
class Icici extends Bank
{
	int getRateofinterest() 
	{
		return 20;
	}
}
class Axis extends Bank
{
	int getRateofinterest() 
	{
		return 30;
	}

}
public class MethodOverriding {

	public static void main(String[] args) {
		Sbi sobj=new Sbi();
		System.out.println(sobj.getRateofinterest()); //10
		Icici iciciobj=new Icici();
		System.out.println(iciciobj.getRateofinterest());  //20
		Axis axisobj=new Axis();
		System.out.println(axisobj.getRateofinterest());  //30
	}

}
