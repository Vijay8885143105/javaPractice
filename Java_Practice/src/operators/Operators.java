package operators;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		int a=10;
		int b=20;
		System.out.println(a+b); //30
		System.out.println(b-a); //10
		System.out.println(a*b); //200
		System.out.println(a/b);  //0
		System.out.println(a%b);  //10
		
		//Relational operators
		System.out.println(a<b); //true
		System.out.println(a>b); //false
		System.out.println(a<=b); //true
		System.out.println(a>=b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		//Logical operators
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);  //false
		System.out.println(x||y);  //true
		System.out.println(!x);  //false
		System.out.println(!y);  //true
		
		//Assignment operator
		int c;
		c=a;
		System.out.println(c);    //10
		c=b;
		System.out.println(c);  //20
		
		//Increment operator
		c=100;
		//c=c+1; 
		//OR
		//c++;
		//OR
		c+=1;
		System.out.println(c); //101
		
		//Decrement operator
		c=100;
		//c=c-1;
		//OR
		//c--;
		//OR
		c-=1;
		System.out.println(c); //99
		
		
		

		







		

	}

}
