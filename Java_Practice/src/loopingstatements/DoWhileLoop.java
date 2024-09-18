package loopingstatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i=2;
		do
		{
			System.out.println(i);   //1 2 3 4  5 6 7 8 9 10 11 12 13 14    if i=1  increment by 1
			                                             //2 4 6 8 10 12   if i=2   increment by 2
			//i++;
			//i+=1;
			i+=2;
		}while(i<=12);          


	}

}
