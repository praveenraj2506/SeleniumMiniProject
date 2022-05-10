package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//xpath find for dropDown1
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		//object create for select
		Select s = new Select(dropDown1);
		s.selectByIndex(3);
		
		//dropDown2
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select s1 = new Select(dropDown2);
		s1.selectByVisibleText("Appium");
		
		//dropDown3
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select s2= new Select(dropDown3);
		s2.selectByValue("1");
		
		//dropDown4
		WebElement dropDown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(dropDown4);
		List<WebElement> options = s3.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//dropDown5
		WebElement dropDown5 = driver.findElement(By.xpath("(//select)[5]"));
		dropDown5.sendKeys("Selenium");
		
		//dropDown6
		WebElement multipleDropdown = driver.findElement(By.xpath("(//select)[6]"));
		Select s4 = new Select(multipleDropdown);
		s4.selectByIndex(4);
		s4.selectByValue("2");
		s4.selectByVisibleText("UFT/QTP");
		
		//isMultiple
		boolean multiple2 = s4.isMultiple();
		System.out.println(multiple2);
		System.out.println("*********All Options**********");
		
		//getOptions
		List<WebElement> multiple = s4.getOptions();
		for (WebElement all : multiple) {
			String text = all.getText();
			System.out.println(text);	
		}
		System.out.println("*********Selected Options**********");
		
		//getAllselectedoptions
		List<WebElement> Selected = s4.getAllSelectedOptions();
		for (WebElement selectedOptions : Selected) {
			String text = selectedOptions.getText();
			System.out.println(text);
					}
		System.out.println("*********First Selected Options**********");
		
		//getfirstselectedoption
		WebElement first = s4.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
			
		  //deselect All 
		s4.deselectAll();
		
		driver.close();
		 
		}
	}


