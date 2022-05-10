package org.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		
		//enter email
		driver.findElement(By.id("username")).sendKeys("praveenraj2506");
		//enter password
		driver.findElement(By.id("password")).sendKeys("Npr@veen7");
		//click login button
		driver.findElement(By.id("login")).click();
		
		//Select Location
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("New York");
						
		//select Hotels
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement text = s1.getFirstSelectedOption();
		String text2 = text.getText();
		System.out.println(text2);
		
		//Select RoomType
		WebElement RoomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(RoomType);
		s2.selectByValue("Deluxe");
		
		//select No of Rooms
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noOfRooms);
		s3.selectByIndex(1);
		WebElement RoomSelect = s3.getFirstSelectedOption();
		String text3 = RoomSelect.getText();
		System.out.println(text3);
		
		//enter Check In Date
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("12/03/2022");
		
		//enter Check Out date
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("13/03/2022");
		
		//select Adult per room
		WebElement Adult = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(Adult);
		s4.selectByValue("2");
		
		//select Children Per Room
		WebElement Child = driver.findElement(By.id("child_room"));
		Select s5= new Select(Child);
		s5.selectByIndex(0);
		
		//Click Search Button
		driver.findElement(By.id("Submit")).click();
		
		//select RadioButton
		driver.findElement(By.id("radiobutton_0")).click();
		
		//click Continue 
		driver.findElement(By.id("continue")).click();
		
		//enter firstname
		driver.findElement(By.id("first_name")).sendKeys("Praveenraj");
		
		//enter last name
		driver.findElement(By.name("last_name")).sendKeys("N");
		
		//enter address
		driver.findElement(By.name("address")).sendKeys("107,North car street , Chennai - 28");
		
		//enter credit card number
		driver.findElement(By.id("cc_num")).sendKeys("3421587609127531");
		
		//select credit card type
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardType);
		s6.selectByIndex(2);
		
		//select expiry  month
		WebElement expMonth = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(expMonth);
		s7.selectByVisibleText("July");
		
		//select expiry year
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expYear);
		s8.selectByValue("2022");
		
		//enter cvv number
		driver.findElement(By.id("cc_cvv")).sendKeys("486");
		
		//click book now 
		driver.findElement(By.id("book_now")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.id("my_itinerary")).click();
		
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Screenshot\\adactin.png");
		FileUtils.copyFile(source, target);
		
		  //click logout 
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		  
		  //close the tab 
		driver.close();
		 
		
	}

}
