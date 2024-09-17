package oopsConcept1;

public class EmployeeObject {
	int empid;
	String empname;
	int empsalary;
	int depnum;
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(depnum);

	}
	public static void main(String[] args) {
		//Assigning values to class variables using Object-First method
		EmployeeObject emp1=new EmployeeObject();
		emp1.empid=12345;
		emp1.empname="Vijay";
		emp1.empsalary=12000;
		emp1.depnum=16754;
		emp1.display();


		//Second Employee
		EmployeeObject emp2=new EmployeeObject();
		emp2.empid=6787535;
		emp2.empname="vasavi";
		emp2.empsalary=10000;
		emp2.depnum=6788835;
		emp2.display();



	}

}
