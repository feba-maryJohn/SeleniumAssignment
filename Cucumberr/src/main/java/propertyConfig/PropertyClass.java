package propertyConfig;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	
		private Properties property;
		private final String filePath = "C:\\Users\\febamary.john\\git\\SeleniumAssignment\\Cucumberr\\configuration\\config.properties";
		// path of config.properties file
		
		
		public PropertyClass() {
			
			BufferedReader buffer;
			try {
				
				buffer = new BufferedReader(new FileReader(filePath));
				property = new Properties();
				try {
					
					property.load(buffer);
					buffer.close();
				
				}catch(IOException e) {
					
						e.printStackTrace();
				}
					
			}catch(FileNotFoundException e) {
					
					e.printStackTrace();
					throw new RuntimeException("File not found at "+filePath);
			}
			
		}
		
		public String getUrl() {
			
			String url = property.getProperty("url");     //gets URL from config.properties file
			if(url!=null) {
				System.out.println("URL: "+url);
				return url;
			}
			else
				throw new RuntimeException("URL is not specified in config.properties file");
			
	}
		
		public String getChromeDriverPath() {
				
				String driverPath = property.getProperty("chromeDriverPath");    //gets ChromeDriver path from config.properties file
				if(driverPath!=null) {
					System.out.println("ChromeDriver Path: "+driverPath);
					return driverPath;
				}
					
				else
					throw new RuntimeException("ChromeDriver path is not specified in config.properties file");
				
		}
		
		public String getBrowser() {
			
			String browser = property.getProperty("browser");   //gets browser from config.properties file
			if(browser!=null) {
				System.out.println("Browser: "+browser);
				return browser;
			}
			else
				throw new RuntimeException("Browser is not specified in config.properties file");
			
	}
		
		public String getTopic() {
			
			String topic = property.getProperty("topic");      //gets topic to be searched from config.properties file
			if(topic!=null) {
				System.out.println("Topic searched: "+topic);
				return topic;
			}
			else
				throw new RuntimeException("Topic is not specified in config.properties file");
			
	}
	
	

}
