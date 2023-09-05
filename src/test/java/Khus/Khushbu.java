package Khus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Khushbu
{
	@Test(priority=1, enabled= true)

	public void GooglePixeldetails() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//home/ec2-user/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless"); // Run in headless mode
        chromeOptions.addArguments("--disable-gpu"); // Disable GPU acceleration
        
        // Create a new ChromeDriver instance with the specified ChromeOptions
        WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://3.110.143.11:3000/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//a[1]")).click();
	}

	@Test(priority=2, enabled= true)

	public void OpenCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/ec2-user/chromedriver");

		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless"); // Run in headless mode
        chromeOptions.addArguments("--disable-gpu"); // Disable GPU acceleration
        
        // Create a new ChromeDriver instance with the specified ChromeOptions
        WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://3.110.143.11:3000/");

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//i[normalize-space()='my cart']")).click();
		System.out.println("Hello ");
	}

	@Test(priority=3, enabled=true)

	public void InCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//home/ec2-user/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless"); // Run in headless mode
        chromeOptions.addArguments("--disable-gpu"); // Disable GPU acceleration
        
        // Create a new ChromeDriver instance with the specified ChromeOptions
        WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://3.110.143.11:3000/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[normalize-space()='my cart']")).click();
		String Actualresult = driver.getCurrentUrl();
		System.out.println("Actual result : "+ Actualresult);
           Assert.assertEquals(Actualresult,"http://43.205.230.7:3000/cart");
		  

	}

}
