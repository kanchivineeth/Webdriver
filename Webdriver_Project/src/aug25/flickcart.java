package aug25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flickcart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/flipkart.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac =new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//move mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().build().perform();
		Thread.sleep(5000);
		//Move mouse to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby&kids}'"))).perform();
		Thread.sleep(5000);
		//move mouse to puzzles and click
		ac.moveToElement(driver.findElement(By.linkText("puzzles"))).click().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
