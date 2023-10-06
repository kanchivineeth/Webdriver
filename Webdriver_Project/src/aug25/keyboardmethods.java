package aug25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac=new Actions(driver);
		//click create link
		driver.findElement(By.xpath("//span[contains (text(),'create account')]")).click();
		Thread.sleep(5000);
		//press up arrow for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		//click enter keys
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
