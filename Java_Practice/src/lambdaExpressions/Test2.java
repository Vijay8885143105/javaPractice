package lambdaExpressions;
@FunctionalInterface
interface Van
{
	public String bookCab(String source , String destination);
}
/*class Ola implements Van{
	public String bookCab(String source , String destination){
		System.out.println("Van Cab is booked from     "+source+"       To      "+destination);
		return("Price :::::::::::  5000 Rs");
	}
}*/
public class Test2 {

	public static void main(String[] args) {
		//Van abc = new Ola();
		Van abc=(source,destination)->{System.out.println("Van Cab is booked from     "+source+"       To      "+destination);
		return("Price :::::::::::  5000 Rs");};
	System.out.println(abc.bookCab("Hyd", "Karimnagar"));
	
	
	
	//Same output for Both Cases
		//Van Cab is booked from     Hyd       To      Karimnagar
		//Price :::::::::::  5000 Rs


	}

}
