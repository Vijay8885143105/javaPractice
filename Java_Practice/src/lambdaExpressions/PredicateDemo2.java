package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;
class  Employee123
{
	String ename;
	int salary;
	int experience;
	Employee123(String name,int sal,int exp)
	{
		ename=name;
		salary=sal;
		experience=exp;
	}
}
public class PredicateDemo2 {

	public static void main(String[] args) {
		Employee123 emp =new Employee123("Naveen", 100000, 8);
		//emp obj------return boolean  true value if salary>30k and experience>3
		Predicate<Employee123>pr=e->(e.salary>30000 && e.experience>3);
		//System.out.println(pr.test(emp));
		//Example 2:
		ArrayList<Employee123>al=new ArrayList<Employee123>();
		al.add(new Employee123("vijay", 90000, 6));
		al.add(new Employee123("Naveen", 60000, 5));
		al.add(new Employee123("Omkar", 20000, 2));
		al.add(new Employee123("Hemanth", 10000, 1));

		for (Employee123 e : al)
		{
			if (pr.test(e)) 
			{
				if (e.salary>30000&&e.experience>3)
				{
					System.out.println(e.ename+"            "+e.salary);
				}
			}
		}
	}
}



