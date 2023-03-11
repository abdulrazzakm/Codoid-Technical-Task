package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinDropDown {
	public static void main(String[] args) throws InterruptedException  {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\AdactinHotel\\ChromeDriver\\chromedrivernew.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://adactinhotelapp.com/index.php");
		
		d.findElement(By.id("username")).sendKeys("AbdulRazzakM");
		d.findElement(By.id("password")).sendKeys("K2D846");
		d.findElement(By.id("login")).click();
		
		WebElement location = d.findElement(By.name("location"));
		Select b = new Select(location);
		b.selectByIndex(5);
		WebElement hotels = d.findElement(By.name("hotels"));
		Select b1 = new Select(hotels);
		b1.selectByValue("Hotel Creek");
		WebElement room = d.findElement(By.id("room_type"));
		Select b2 = new Select(room);
		b2.selectByIndex(2);
		WebElement numberofroom = d.findElement(By.id("room_nos"));
		Select b3 = new Select(numberofroom);
		b3.selectByIndex(4);

		d.findElement(By.xpath("//input[@value='11/03/2023']")).sendKeys("03/03/2023");

		d.findElement(By.xpath("//input[@value='12/03/2023']")).sendKeys("05/03/2023");
		
		WebElement adultroom = d.findElement(By.id("adult_room"));
		Select b4 = new Select(adultroom);
		b4.selectByIndex(2);
		Thread.sleep(3000);
		WebElement search = d.findElement(By.id("Submit"));
		search.click();
		WebElement radiobutton = d.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		Thread.sleep(3000);

		WebElement continuebutton = d.findElement(By.id("continue"));
		continuebutton.click();
		d.findElement(By.xpath("//input[@class='reg_input']")).sendKeys("Abdul");
		
		d.findElement(By.id("last_name")).sendKeys("Razzak");
		d.findElement(By.id("address")).sendKeys("No:15/8, Moun Road, Chennai-600002");

		d.findElement(By.name("cc_num")).sendKeys("4401258088258686");

		WebElement cctype = d.findElement(By.xpath("//select[@id='cc_type']"));
		Select b5 = new Select(cctype);
		b5.selectByIndex(2);

		WebElement expmonth = d.findElement(By.id("cc_exp_month"));
		Select b6 = new Select(expmonth);
		b6.selectByIndex(3);

		WebElement expireyear = d.findElement(By.id("cc_exp_year"));
		Select b7 = new Select(expireyear);
		b7.selectByValue("2022");

		WebElement cvv = d.findElement(By.id("cc_cvv"));
		cvv.sendKeys("044");
		Thread.sleep(3000);

		WebElement clickbook = d.findElement(By.id("book_now"));
		clickbook.click();
		Thread.sleep(6000);
		d.findElement(By.id("order_no")).getText();
		

	}
}
