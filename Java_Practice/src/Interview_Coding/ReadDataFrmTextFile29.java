package Interview_Coding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFrmTextFile29 {

	public static void main(String[] args) throws Throwable {
		//Approach 1
		/*FileReader fr=new FileReader("D:\\VijayTexton25thoctober.text");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();*/

		//Approach 2
		/*File f=new File("D:\\VijayTexton25thoctober.text");
		Scanner scr=new Scanner(f);
		while (scr.hasNext()) {                   //hasNext is the conditional command //returns true or false
			String Req=scr.nextLine();
			System.out.println(Req);
		}*/

		//Approach 3
		File f=new File("D:\\VijayTexton25thoctober.text");
		Scanner scr=new Scanner(f);
		scr.useDelimiter("\\d");
		System.out.println(scr.next());
	}
}
