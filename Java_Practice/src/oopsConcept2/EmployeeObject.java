package oopsConcept2;

public class EmployeeObject {
	//Global variables
	int empid;
	String empname;
	int salary;
	int depno;
	//display() method
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depno);
	}
	public static void main(String[] args) {
		//Creating reference Object 
		//Assigning values to class variables using Object
		EmployeeObject emp1=new EmployeeObject();    //First employee
		emp1.empid=1234;
		emp1.empname="Vijay Sheri";
		emp1.salary=40000;
		emp1.depno=1;
		emp1.display();
		System.out.println("===================================");
		//Creating reference Object 
		//Assigning values to class variables using Object
		EmployeeObject emp2=new EmployeeObject();   //Second employee
		emp2.empid=1222;
		emp2.empname="Hanish Sheri";
		emp2.salary=80000;
		emp2.depno=2;
		emp2.display();
	}

}
