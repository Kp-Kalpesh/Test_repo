package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtility_OldOne {

	WebDriver driver;                            //default value = null
	public void startUp(String Url, String bName)
	{
		//	driver = new ChromeDriver();

		String path = System.getProperty("user.dir");

		if(bName.equalsIgnoreCase("CH") || bName.equalsIgnoreCase("Chrome")) {

			//			System.setProperty("webdriver.chrome.driver", "/Users/kalpeshpatil/eclipse-workspace/Feb_13_17_Selenium/drivers/chromedriver");

			//			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver");

			driver.get(Url);
			driver = new ChromeDriver();     //Upcasting, we stored the child class object inside the parent class reference variable

			//driver.wait(5000);

		}else
		{
			System.out.println("Invalid browser Name!");
		}
		driver.get(Url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.quit();

	}
}
