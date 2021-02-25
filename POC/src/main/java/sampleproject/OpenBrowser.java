package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	public static WebDriver driver;
	
	@Test
	public static void browser() {
		
		System.setProperty("webdriver.ie.driver", "E:\\NTG Jenkins\\POC\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		
		
	}

}
