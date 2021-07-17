package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test1 extends BaseClass {
	
	
	@Test
	public void testone() {
		
		driver.get("https://google.com");
		driver.findElementByClassName("o3j99 ikrT4e om7nvf").sendKeys("Customer Experience Group");
		driver.findElementByClassName("o3j99 ikrT4e om7nvf").sendKeys(Keys.ENTER);
		
		System.out.println("Completed test one..");
		
		
	}

}
