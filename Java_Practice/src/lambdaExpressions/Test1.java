package lambdaExpressions;
@FunctionalInterface
interface Car
{
	public void bookCab(String source,String destination);
}

/*class Ola implements Car{                       //This Class is Not Required for write Lambda Expression
	public void  bookCab(String source,String destination){
		System.out.println("Ola car is booked   from    "+source+"    To     "+destination);
	}
}*/
public class Test1 {

	public static void main(String[] args) {
		//Car ab=new Ola();
		Car ab=(source,destination)->System.out.println("Ola car is booked   from    "+source+"    To     "+destination);
		//Optimization of code 
		ab.bookCab("Hyd", "Ananthapuram");


	}

}
