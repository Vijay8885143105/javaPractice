package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	Employee(String name,int sal,int exp){
		ename=name;
		salary=sal;
		experience=exp;	
	}
}

public class PredicateDemo2 {
	public static void main(String[] args) {
		//Example 1:
		Employee emp=new Employee("Naveen",40000,4);
		//emp obj>>> return name if sal>50k &&exp>3
		//Predicate<Employee> pr=e->(e.salary>30000&&e.experience>3);
		//System.out.println(pr.test(emp));     //true

		//Example2:
		Predicate<Employee> pr=e->(e.salary>30000&&e.experience>3);
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee("Naveen",40000,5));
		al.add(new Employee("Omkar",20000,2));
		al.add(new Employee("Vamshi",35000,4));
		al.add(new Employee("Hemanth Kumar",15000,1));
		for (Employee Eny: al) {
			if (pr.test(Eny)) {
				System.out.println(Eny.ename+"           "+Eny.salary);     //Naveen           40000
				                                                                                                           //Vamshi           35000

			}
		}



	}
}

