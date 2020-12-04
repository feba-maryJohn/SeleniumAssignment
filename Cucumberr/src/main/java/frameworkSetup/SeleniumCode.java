package frameworkSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumCode {
	
	WebDriver driver;
	String url = "https://www.google.com";
	
    @BeforeTest
    public void setUp() throws Exception{
        
    	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    	    driver = new ChromeDriver();
    		
    	}
    
    @Test
    public void testChrome() throws Exception{
       
    				driver.get(url);
    				driver.manage().window().maximize();
    				Thread.sleep(4000);
    	}
    
    @AfterTest
    public void tearDown() throws Exception{
        	
    		driver.close();
    }

}
