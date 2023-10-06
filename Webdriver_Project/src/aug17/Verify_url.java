package aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured:::"+Expected+"    "+Actual);
		}
		else
		{
			System.out.println("url is Not Secured:::"+Expected+"     "+Actual);
		}
		driver.quit();
		

	}

}
