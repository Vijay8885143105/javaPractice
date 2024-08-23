package oopsConcept;

public class EmployeeMethod {
	int empid;
	String empname;
	int empsalary;
	int empdepno;

	void display(int id,String name,int sal ,int no) {
		empid=id;
		empname=name;
		empsalary=sal;
		empdepno=no;
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empdepno);	
	}
	public static void main(String[] args) {
		//Assigning values to class variables using method-third method
		EmployeeMethod emppp=new EmployeeMethod();
		emppp.display(0343, "Navya", 2436, 4633);
		EmployeeMethod empp=new EmployeeMethod();
		empp.display(363737, "vasavi", 36467, 99999);

		

	}

}
