package interview_Coding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile30 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("D:\\VijayTexton25thoctober.text");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Vijay learning java");
		bw.newLine();
		bw.write("Vijay learning selenium");
		bw.newLine();
		bw.write("Vijay learning english");
		bw.newLine();
		bw.write("Vijay learning speaking english");
		bw.newLine();
		bw.write("Vijay learning new technology");
		bw.newLine();
		System.out.println("Finished");
		bw.close();
	}

}
