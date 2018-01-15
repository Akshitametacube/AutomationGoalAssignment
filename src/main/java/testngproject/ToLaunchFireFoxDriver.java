package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireFoxDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\Browser\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

	}

}
