package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloGoogleTest {

	@Test
	public void firstSeleniumTest() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\libs\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		driver.get("https://www.bluespacelabs.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000 * 15);
		driver.quit();
	}
}
