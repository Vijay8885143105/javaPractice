package inheritance;

class Bank
{	
	int  getRateofinterest() {

		return 0;

	}
}
class SBI extends Bank{
	int getRateofinterest() {//Overridden

		return 20;
	}
}
class icici extends SBI{
	int getRateofinterest() {//Overridden

		return 25;
	}
}
class Axis extends icici{
	int getRateofinterest() {//Overridden

		return 30;

	}
}
public class Overidding{
	public static void main(String[] args) {
		SBI osbi=new SBI();
		System.out.println(osbi.getRateofinterest());
		icici oicici=new icici();
		System.out.println(oicici.getRateofinterest());
		Axis oaxis=new Axis();
		System.out.println(oaxis.getRateofinterest());


	}

}
