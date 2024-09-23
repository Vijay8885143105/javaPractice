package oopsConcept2;

public class EmployeeMethod {
	//Global variables declaration
 int empid;
 String empname;
 int salary;
 int depno;
 //setdata() method
	void setdata(int  id,String name,int sal,int num)
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
		//Assigning values to the class variables using method
		EmployeeMethod emp1=new EmployeeMethod();  //employee1
		emp1.setdata(333,"Madunitha" ,30000, 2);
		emp1.display();
		System.out.println("=========================================");
		EmployeeMethod emp2=new EmployeeMethod();  //employee1
		emp1.setdata(3334,"Anitha" ,50000, 4);
		emp1.display();

	}

}
