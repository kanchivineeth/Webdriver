package aug25;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Down_Arrow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac= new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium openings");
		Thread.sleep(50000);
		//press down arrow for three times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		//click on enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
