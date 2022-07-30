package com.mindtree.seleniumclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindedge204\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[1]/div/a[1]/picture/img")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"global-navigation-header\"]/ul/li[2]/div/label/span")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"global-navigation-header\"]/ul/li[4]/div/label/span")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"global-navigation-header\"]/ul/li[5]/a")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[2]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header-nav\"]/div[2]/div/div[2]/div/div")).click();
		
		
		
	}}



