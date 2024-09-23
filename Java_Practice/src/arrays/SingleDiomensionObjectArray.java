package arrays;

public class SingleDiomensionObjectArray {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=3;
		a[1]="Vasavi";
		a[2]='A';
		a[3]=3.25;
		a[4]=true;
		for(Object k: a)
		{
			System.out.println(k);
		}

	}
}
