package org.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtility {

	private WebDriver driver;                            //default value = null
	public WebDriver startUp(String Url, String bName)
	{
		String path = System.getProperty("user.dir");

		if(bName.equalsIgnoreCase("CH") || bName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver");
			driver = new ChromeDriver();    
		}else
		{
			System.out.println("Invalid browser Name!");
		}
		driver.manage().window().maximize();
//		driver.manage().window().minimize();     //Selenuim 4 onwards
		driver.manage().window().setSize(new Dimension(1000,1000));
		driver.get(Url);
		driver.manage().deleteAllCookies();
//		driver.manage().wait(5000);
//		driver.quit();
		return driver;
	}
}
