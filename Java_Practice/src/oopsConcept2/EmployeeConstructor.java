package oopsConcept2;

public class EmployeeConstructor {
	//Global variables declaration
	int empid;
	String empname;
	int salary;
	int depno;
	//Constructor
	EmployeeConstructor(int id,String name,int sal,int num)
	{
		empid=id;
		empname=name;
		salary=sal;
		depno=num;	
	}
	//display() method
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depno);
	}
	public static void main(String[] args) {
		//Assigning values to the class variables using constructor
		EmployeeConstructor emp1=new EmployeeConstructor(7653, "Vasavi",20000,3);
		emp1.display();
		System.out.println("===========================================");
		EmployeeConstructor emp2=new EmployeeConstructor(7773, "Lavanya",40000,6);
		emp2.display();

	}

}
