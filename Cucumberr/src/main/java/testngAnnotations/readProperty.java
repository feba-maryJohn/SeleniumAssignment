package testngAnnotations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyConfig.PropertyClass;

public class readProperty {
	
	PropertyClass propertyClass;
	WebDriver driver;
	String url = "https://twitter.com/login";

	
	@Before
	public void setUp()throws Exception{

	propertyClass = new PropertyClass();
	System.setProperty("webdriver.chrome.driver",propertyClass.getChromeDriverPath());
	driver = new ChromeDriver();
	driver.get(propertyClass.getUrl());
	driver.get(propertyClass.getChromeDriverPath());
	driver.manage().window().maximize();
	Thread.sleep(4000);


	}

	@Test
	public void testReadProperties()throws Exception{

				propertyClass.getBrowser();
				String topic = propertyClass.getTopic();
				driver.findElement(By.xpath("/html/body/div[4]/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys(topic);
		
	}
	
	@After
	public void tearDown()throws Exception{

		Thread.sleep(4000);	
		driver.quit();
		}
	



}
