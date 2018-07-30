package com.cg.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
     try {
    	 
    	 System.setProperty("webdriver.chrome.driver","D:\\Sowmya\\bdd software\\chromedriver.exe");
    	 
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("http://www.google.com");
 
    	 WebElement element1=driver.findElement(By.id("lst-ib"));
    	 element1.sendKeys("pluralsight");
    	
    	 element1.submit();
    	 
    	 
     }catch(Exception e){e.printStackTrace();}

		
		
		
		
		
	}

}
