package sep9;

import org.openqa.selenium.By;

public class Child extends parent{
public static void clickBranches()
{
	driver.findElement(By.xpath("//img[5]")).click();
}
	public static void main(String[] args) { 
		parent.launchurl("http://primusbank.qedgetech.com/");
		parent.login("Admin", "Admin");
		Child.clickBranches();

	}

}
