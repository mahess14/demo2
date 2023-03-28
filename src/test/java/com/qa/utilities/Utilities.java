package com.qa.utilities;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {
	
	public static RemoteWebDriver driver;
	//Operational methods
		public RemoteWebDriver openBrowser(String browsername) throws Exception
		{
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				
			}
			else if(browsername.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
			}
			else if(browsername.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			else
			{
				System.out.println("Entered wrong browser name");
			} 
			return(driver);
		}
		
		public FluentWait<RemoteWebDriver> defineWait
		                                   (RemoteWebDriver driver, int max, long interval) 
		{
			FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(max));
			wait.pollingEvery(Duration.ofMillis(interval));
			return(wait);
		}
		
		public void launchSite(RemoteWebDriver driver, String env) throws Exception
		{
			String url=null;
			switch(env)
			{
				case "DEV":
					url="http://www.google.co.in";
					break;
				case "QA":
					url="http://www.google.co.in";
					break;
				case "UAT":
					url="http://www.google.com";
					break;
				case "PROD":
					url="http://www.google.co.in";
					break;
			}
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		public void closeSite(RemoteWebDriver driver)
		{
			driver.quit();
		}

}
