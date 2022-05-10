package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	static int  indexOfCases,indexOfDeaths,indexOfRecovered;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> all_header = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		
		for (int i = 0; i < all_header.size(); i++) {
			String text = all_header.get(i).getText();
			String header = text.replaceAll("\n", " ");
			System.out.println(header);
			
			if (header.equalsIgnoreCase("New Cases")) {
				indexOfCases=i;
				System.out.println(" IndexOf New Cases : "+indexOfCases);
				
			}
			if (header.equalsIgnoreCase("New Deaths")) {
				indexOfDeaths=i;
				System.out.println("IndexOf New deaths : "+indexOfDeaths);
				
			}
			if (header.equalsIgnoreCase("New Recovered")) {
				indexOfRecovered=i;
				System.out.println("IndexOf New Recovered : "+indexOfRecovered);
				
			}
		}
	List<WebElement> all_row = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
			
	for (int i = 0; i < all_row.size(); i++) {
		
		List<WebElement> all_data = all_row.get(i).findElements(By.tagName("td"));
		
		for (int j = 0; j < all_data.size(); j++) {
			if (all_data.get(j).getText().equalsIgnoreCase("India")) {
				System.out.println("New Cases : "+all_data.get(indexOfCases).getText());
				System.out.println("New Deaths : "+all_data.get(indexOfDeaths).getText());
				System.out.println("New Recovered : "+all_data.get(indexOfRecovered).getText());
			}
			
		}
		
	}
			
		}
	}


