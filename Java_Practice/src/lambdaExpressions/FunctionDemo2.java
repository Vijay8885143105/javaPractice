package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employeee{
	String ename;
	int salary;
	public Employeee(String ename,int salary) {
		this.ename=ename;      //this key word is used for global variable of the current class
		this.salary=salary;
	}
}
public class FunctionDemo2 {

	public static void main(String[] args) {
		ArrayList<Employeee> emplist=new ArrayList<Employeee>();
		emplist.add(new Employeee("Naveen", 50000));
		emplist.add(new Employeee("Vamshi", 30000));
		emplist.add(new Employeee("Vijay", 20000));
		Function<Employeee, Integer>fn=e->{ ////Two arguments    i/p type(0r)Parameter type , o/p type(or)Return type
			int      sal   =e.salary;
			if (sal>=10000&&sal<=20000)
			{
				return (sal *10/100);
			} 
			else  if(sal>=20000&&sal<=30000)
			{
				return (sal *20/100);
			}
			else if (sal>=30000&&sal<=50000) 
			{
				return (sal *30/100);
			}
			else
				return (sal*40/100);};
				Predicate<Integer>p=b->b>3000;
				for (Employeee emp : emplist) {
					int bonus		=	fn.apply(emp);            //function
					if (p.test(bonus)) {                                  //Predicate
						//Now bonus greater than 3k only print
						System.out.println(emp.ename+"                     "+emp.salary);
						System.out.println("Bonus is       :"+"      "+bonus);
					}
				}

	}
}
