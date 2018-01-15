package testngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignemnt5Part2 {

	public static void main(String[] args) {
		
		//Setting path for chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		//Creating driver instance
		WebDriver driver = new ChromeDriver();
				
		//Creating an Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Launch site in browser 
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		System.out.println("Practice Automation Form is launched");
		
		//Enter first name and last name
		driver.findElement(By.name("firstname")).sendKeys("Akshita");
		driver.findElement(By.name("lastname")).sendKeys("Bhargava");
		
		//Select sex and years of experience
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-3")).click();
		
		//Enter date
		driver.findElement(By.id("datepicker")).sendKeys("02/01/2018");
		
		//Select Profession and Automation Tool
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("tool-2")).click();
		
		//Select Continent as South America
		Select continentSelect = new Select(driver.findElement(By.id("continents")));
		continentSelect.selectByVisibleText("South America");
		
		//Select Selenium Commands as South America
		Select commandSelect = new Select(driver.findElement(By.id("selenium_commands")));
		commandSelect.selectByVisibleText("Switch Commands");
		
		//Click on button
		driver.findElement(By.id("submit"));
		
		System.out.println("Data entered and submitted successfully.");
		
		
		//Close current window 
		driver.close();
						
		//Close all windows open from script
		driver.quit();

		
		
		

	}

}
