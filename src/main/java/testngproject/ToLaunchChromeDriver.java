package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLaunchChromeDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();


	}

}
