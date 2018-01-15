package testngproject;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {

	public static void main(String[] args) {
		
		//Setting path for chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		//Creating driver instance
		WebDriver driver = new ChromeDriver();
		
		//
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		//Launch site in browser 
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Selenium Framework site is launched");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Creating a fluent wait
		// Waiting 30 seconds for an element to be present on the page, checking for its presence once every 3 seconds.
		 
		//Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);		
		
		
		// Create an implicit wait
		// Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Find element8 link and click
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Element8']"))).click();
        System.out.println("Successfully clicked on 'Element8' link");
        
        //Close current window 
        driver.close();
      						
      	//Close all windows open from script
      	driver.quit();
		
		
		
	}

}
