package sep6;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfromwriteinto {

	public static void main(String[] args) throws Throwable{
		// write para from primusbank application
		File f = new File("D:/vineeth.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		String para1 =driver.findElement(By.xpath("(//p[position()=1])[2]")).getText();
		String para2 =driver.findElement(By.xpath("//p[position()=2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();  
		

	}

}
