package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class with_xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[starts-with(@id,'u_0')])[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Testing");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("Testing@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("Testing@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("test@1234");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("Testing@gmail.com");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(20);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(6);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByVisibleText("1987");
		driver.findElement(By.xpath("//form[@id='reg']following::input[10]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//follwing::button[1]")).click();
		
	}

}
