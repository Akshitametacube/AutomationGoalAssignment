package testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		//Setting path for chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		//Creating driver instance
		WebDriver driver = new ChromeDriver();
		
		//1.1 Launch site in browser 
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Selenium Framework site is launched");
		
		//1.2 Launch home page
		driver.navigate().to("http://www.seleniumframework.com/");
		System.out.println("Home page for Selenium Framework site is launched");
		
		//1.3 Navigating back using browser back button
		driver.navigate().back();
		System.out.println("Navigated back to Practice form for Selenium Framework site");
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		
		//2. Display title of link 'This is a link'
		
		WebElement element = driver.findElement(By.xpath("//a[text()='This is a link']"));
		String linkTitle = element.getAttribute("title");
		System.out.println("Link title is " +linkTitle);
		
		//3. Enter email address and subscribe
		
		//Locating email textbox and submit button
		WebElement emailSubscribe = driver.findElement(By.xpath("//section[@id='text-11']//p//input"));
		WebElement buttonSubscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		
		//3.1 Enter email address
		emailSubscribe.sendKeys("test1@test.com");
		
		//3.2 Click on Subscribe button
		buttonSubscribe.click();
		
		System.out.println("Subscription done for entered email.");
		
		//4. Enter details for Contact Us form
		
		driver.findElement(By.name("name")).sendKeys("Akshita");
		driver.findElement(By.name("email")).sendKeys("akshita@test.com");
		driver.findElement(By.name("telephone")).sendKeys("919999888877");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Metacube");
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hi this is new message from automation script.");
		driver.findElement(By.partialLinkText("Submit")).click();
		
		System.out.println("Successfully entered details for Contact Us form");
		
		
		//Close current window 
		driver.close();
				
		//Close all windows open from script
		driver.quit();


	}

}
