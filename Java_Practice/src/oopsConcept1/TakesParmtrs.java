package oopsConcept1;

public class TakesParmtrs {
int a;
int b;
void sum(int x,int y) {
	a=x;
	b=y;
	System.out.println(a+b);
}
	public static void main(String[] args) {
		TakesParmtrs obj=new TakesParmtrs();
		obj.sum(100, 200);

	}

}
