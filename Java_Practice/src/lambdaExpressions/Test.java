package lambdaExpressions;
@FunctionalInterface
interface Cab
{
	public void bookCab();
}
/*class Ola implements Cab{
	public void bookCab() {
		System.out.println("Ola Cab is booked");        //we don't need this class for write Lambda Expression
	}
}*/
public class Test {
	public static void main(String[] args) {
		//Cab cab =new Ola();
		Cab cab=()->System.out.println("Ola Cab is booked");     //->  represents Lambda Expression ,Consized way
		//Optimization of code
		cab.bookCab();
	}
}



