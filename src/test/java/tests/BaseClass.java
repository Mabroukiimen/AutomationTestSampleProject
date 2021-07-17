package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement; 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;


	@BeforeTest
	public void setup() { 
		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			//caps.setCapability("platformName", "Android");
			//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AOSP on IA Emulator");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//caps.setCapability(CapabilityType.APP, "absolute path of my native application");
			caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); //if i'm testing an application on browser


			URL url = new URL("http://localhost:4723/wd/hub");  //https://127.0.0.1:4723/wd/hub 

			driver = new AppiumDriver<MobileElement>(url, caps);          

		}catch (MalformedURLException exp) {
			
			exp.printStackTrace();


		} 

	}

	@Test 
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}

	@AfterTest
	public void teardown() {
		
		driver.close();
		driver.quit();


	}


}
