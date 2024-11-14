package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility_OldOne;

public class Ex_1 {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("*******Program Start*********");
		String browserName = "CH";
		String Url = "https://www.google.com";

		BaseUtility_OldOne bu = new BaseUtility_OldOne();
		bu.startUp(Url, browserName);
		System.out.println("*******Program Ends*********");


	}

}

