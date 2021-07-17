package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.remote.MobileCapabilityType; 
public class test2 extends BaseClass{
	
	
	@Test
    public void testCal() throws InterruptedException {

		driver.get("http://cxgapp.cxg-hub.com.s3-website-eu-west-1.amazonaws.com/login");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.cssSelector("input[name=email]"));
		username.sendKeys("mzm@grr.la");
		Thread.sleep(1000);
		WebElement psw= driver.findElement(By.cssSelector("input[name=password]"));
		psw.sendKeys("QWEqwe123!");

	/*	WebElement remember= driver2.findElement(By.cssSelector("ion-checkbox[ng-valid hydrated ng-dirty ios in-item checkbox-checked interactive ng-touched ion-valid ion-dirty ion-touched]"));
		//WebElement remember= driver2.findElement(By.cssSelector("svg[class=checkbox-icon]"));
		Thread.sleep(3000);
		remember.click();*/
		
		/*WebElement remember= driver2.findElement(By.className("ng-valid hydrated ng-dirty ios in-item checkbox-checked interactive ng-touched ion-valid ion-dirty ion-touched"));
		//WebElement remember= driver2.findElement(By.cssSelector("svg[class=checkbox-icon]"));
		Thread.sleep(3000);
		remember.click();*/
	/*	Thread.sleep(2000);
		WebElement rem = driver2.findElement(By.cssSelector("ion-checkbox[class=class=ng-pristine ng-valid ios in-item interactive hydrated ng-touched ion-pristine ion-valid ion-touched]"));
		rem.click();*/
		//Actions actions = new Actions(driver2);
		//actions.moveToElement(rem);
		//actions.perform();
		Thread.sleep(2000);
		WebElement enter= driver.findElement(By.cssSelector("button[class=login-submit]"));
		//enter.sendKeys(Keys.RETURN);
		enter.click();
		Thread.sleep(2000);
		//frame = WebDriverWait(browser, 10).until(EC.frame_to_be_available_and_switch_to_it((By.ID, 'sg-legacy-iframe')));
		driver.getPageSource();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.urlContains("filter/level"));
	//	driver2.get("http://cxgapp.cxg-hub.com.s3-website-eu-west-1.amazonaws.com/filter/level");
//		Thread.sleep(5000);
	//	WebElement next_page_btn = driver2.find_elements_by_xpath("//li[@class = 'pagination-next']/a")

		//Thread.sleep(3000);

		//WebElement signBtn= driver2.findElement(By.className("login-submit"));
		//signBtn.click();
		//WebElement signinBtn =  driver2.findElement(By.cssSelector("button[class=android.widget.Button]"));
		//driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   //	signinBtn.click();
	//	WebElement signinBtn = driver2.findElement(By.id("10"));
		//signinBtn.click();
		//WebElement remember= driver2.findElement(By.cssSelector("input[name=remember]"));
		wait.until(ExpectedConditions.urlContains("filter/level"));
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
    }


}

