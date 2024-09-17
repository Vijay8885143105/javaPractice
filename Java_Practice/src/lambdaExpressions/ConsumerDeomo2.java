package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	String gender;
	Employee (String ename,int salary,String gender){
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
}
public class ConsumerDeomo2 {
	public static void main(String[] args) {
		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Vijay", 30000, "male"));
		emplist.add(new Employee("Naveen", 60000, "male"));
		emplist.add(new Employee("Vamshi", 50000, "male"));
		emplist.add(new Employee("Vasavi", 80000, "female"));
		//Function
		Function<Employee, Integer>f=emp->(emp.salary*10)/100;   //task1 
		//Predicate
		Predicate<Integer>p=b->b>=5000;       //task2
		//consumer
		Consumer<Employee>c=emp->{
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};   //task3
		for (Employee e : emplist) {
			int	bonus	=f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.println(bonus);
			}
		}
	}
}

