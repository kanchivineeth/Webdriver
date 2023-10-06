package aug21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletebranch {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//clik login button with out username AND password
		driver.findElement(By.name("proceed")).click();
		//capture alert text
		String alert_Message = driver.switchTo().alert().getText();
		System.out.println(alert_Message);
		Thread.sleep(5000);
		//click ok to alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
