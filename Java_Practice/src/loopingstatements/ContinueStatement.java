package loopingstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			if(i==5)
			{
				continue;       //Continue means go to the next number
			}
			System.out.println(i);  //1 2 3 4 6 
		}
	}

}
