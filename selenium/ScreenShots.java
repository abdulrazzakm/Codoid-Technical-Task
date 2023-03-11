package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static void main(String[] args) throws IOException {
		
		// 1.Browser configuration -- Chrome..
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumSampleProject\\ChromeDriver\\chromedrivernew.exe");
			// 2. Launch Browser - Upcasting
			WebDriver driver = new ChromeDriver();
			// 3. Launch URL
			driver.get("https://www.facebook.com/");
			// To maximize the window
			driver.manage().window().maximize();
		    //Create Object For TakesScreenShot Interface Using Down Casting
			TakesScreenshot t = (TakesScreenshot)driver;
			driver.findElement(By.id("email")).sendKeys("8825741031");
			driver.findElement(By.name("pass")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//ToTake Screenshots
			File Loc = t.getScreenshotAs(OutputType.FILE);
			//To Create A File path
			File path = new File("C:\\Users\\user\\Desktop\\ScreenShots\\SS1.png");
			FileUtils.copyFile(Loc, path);
	}
	}

