package com.Pom_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runner_class {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement login = driver.findElement(By.xpath("//span[@class='nav-line-2 ']']"));
	login.click();
	
	WebElement login2 = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	login2.click();
		}

}
