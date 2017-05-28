package com.ssw.com.ssw.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static String driverPath ="C:\\Users\\abhishek.kumar\\Desktop\\driver\\chromedriver_win32\\";
	public static WebDriver driver;

	public static void main(String[] args) {
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Current URL = "+driver.getCurrentUrl());
		System.out.println("Page Title ="+driver.getTitle());
		driver.close();
	}

}
