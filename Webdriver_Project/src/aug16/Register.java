package aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flights.qedgetech.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//click on register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//fill register form
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vineeth");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("12345678910");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kvineeth460@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("5624");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("20-5-2021");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
