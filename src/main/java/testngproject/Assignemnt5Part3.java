package testngproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignemnt5Part3 {

public static void main(String[] args) {
		
		//Setting path for chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		//Creating driver instance
		WebDriver driver = new ChromeDriver();
				
		//Creating an Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//3.a Launch site in browser 
		driver.get("http://money.rediff.com/losers/bse/daily");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Rediff site is launched");
		
		//3.b Get top 10 gainers from section ‘Daily’
		driver.get("https://money.rediff.com/gainers/bse");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Rediff site is launched for gainers.");
		//driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily']")).click();
		//driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily'][contains(text(),'Daily')]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List <WebElement> colList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		System.out.println("Total number of rows in Company column are: "+colList.size());
		System.out.println("The list of top 10 gainers from section ‘Daily’ from the page are: ");
		
			for(int i = 0; i < 10; i++){
				System.out.println(colList.get(i).getText());
			}
		System.out.println("The list of top 10 gainers from section ‘Daily’ from the page generated successfully.");	
		
		
		//3.c Get bottom 10 losers from section Weekly’ 
		driver.get("https://money.rediff.com/losers/bse/weekly");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Rediff site is launched for losers.");
		//driver.findElement(By.xpath("//*[@class='curLink tabs']//a[@href='//money.rediff.com/losers/bse/weekly']")).click();

		List <WebElement> colListNew = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Total number of rows in Company column are: "+colListNew.size());
		System.out.println("The list of bottom 10 losers from  section 'Weekly’ from the page are: ");
		
			for(int j = colListNew.size()-1; j >= colListNew.size()-10; j--){
				System.out.println(colListNew.get(j).getText());
			}
		System.out.println("The list of bottom 10 losers from  section 'Weekly’ from the page generated successfully.");	
		
		//Close current window 
		driver.close();
								
		//Close all windows open from script
		driver.quit();
	}

}
