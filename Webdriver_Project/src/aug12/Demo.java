package aug12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {
		// create instance object for different browser
		WebDriver dirver =new ChromeDriver();
		dirver .manage().window().maximize();
		//delete all cookies in browser
		dirver .manage().deleteAllCookies();
		//launch Url
		dirver .get("https://google.com");
		//suspend tool from execution for 5 second
		Thread.sleep(5000);
		dirver .close();

	}

}
