package sep6;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readlines {

	public static void main(String[] args) throws Throwable{
		//read path of file
		FileReader fr = new FileReader("D:/samantha.txt");
		BufferedReader br = new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(5000);
			System.out.println(str);
		}
		br.close();
		

	}

}
