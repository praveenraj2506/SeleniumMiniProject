package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("praveen");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Raj");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("praveenraj007@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("praveen007");
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByValue("25");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']/option[26]"));
		year.click();
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
		
		WebElement email1 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		email1.sendKeys("praveenraj007@gmail.com");
		
		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		
	
	
	}

}
