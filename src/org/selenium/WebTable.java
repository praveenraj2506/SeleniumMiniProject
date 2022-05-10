package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		System.out.println("=======All Data========");
		
		Thread.sleep(2000);
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement all : allData) {
			String text = all.getText();
			System.out.println(text);
			
		}
		
		System.out.println("=======Particular Row Data======");
		Thread.sleep(2000);
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
		for (WebElement row : rowData) {
			String text = row.getText();
			System.out.println(text);
		}
		
		System.out.println("=======Particular column Data=========");
		Thread.sleep(2000);
		List<WebElement> ColumnData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement column : ColumnData) {
			String text = column.getText();
			System.out.println(text);
		}
		
		System.out.println("=======Particular Data========");
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]"));
		String text2 = data.getText();
		System.out.println(text2);
		
		System.out.println("=======Header=======");
		Thread.sleep(2000);
		List<WebElement> headerdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement header : headerdata) {
			String text = header.getText();
			System.out.println(text);
		}
		
	}

}
