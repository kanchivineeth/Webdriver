package sep6;

import java.io.*;

public class Write_text {

	public static void main(String[] args) throws Throwable{
		// create new file
		File f =new File("D:/samantha.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("iam not fool");
		bw.newLine();
		bw.write("iam not evil");
		bw.newLine();
		bw.write("iam badboy");
		bw.flush();
		bw.close(); 
		

	}

}
