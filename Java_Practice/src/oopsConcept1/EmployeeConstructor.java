package oopsConcept1;

public class EmployeeConstructor {
	
	int empid;
	String empname;
	int empsalary;
	int depno;
	//Constructor
	EmployeeConstructor(int id,String name,int salary,int num)
	{
	empid=id;
	empname=name;
	empsalary=salary;
	depno=num;
	}
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(depno);

	}
	
	public static void main(String[] args) {
		//Assigning values to class variables using Constructor-Method 2
		EmployeeConstructor emp1=new EmployeeConstructor(1024,"Vidya",10000,4356);
		emp1.display();
		EmployeeConstructor emp2=new EmployeeConstructor(1004,"Mayank",10350,8766);
		emp2.display();

		

	}

}

