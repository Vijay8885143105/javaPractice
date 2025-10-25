package interview_Coding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile30 {

	public static void main(String[] args) throws Throwable {
		//        / represents the root directory and is used as a directory separator.
		//       // can be used in network paths 
	// Understanding the usage of \ and \\ is essential for correctly handling strings and paths in programming
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
