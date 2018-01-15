package testngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ToLaunchIEDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","E:\\Browser\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();

	}

}
