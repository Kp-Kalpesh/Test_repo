package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex_2 {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("*******Program Start*********");
		String browserName = "CH";
		String Url = "https://www.google.com";

		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.startUp(Url, browserName);
		
		System.out.println("*******Program Ends*********");


	}

}

