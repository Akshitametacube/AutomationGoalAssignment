package testngproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		//Setting path for chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		//Creating driver instance
		WebDriver driver = new ChromeDriver();
		
		//Launch site in browser 
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Selenium Framework site is launched");
		
		//1. Count Input boxes on current page
		
		List <WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println("Total number of input boxes on current page are: "+list.size());
		
		/*
		for(int i = 0; i < list.size(); i++){
		System.out.println(list.get(i).getAttribute("name"));
		}
		*/
		
		//2. The current color code of the box with title ‘Change Color’.
		
		String buttonColor = driver.findElement(By.id("colorVar")).getAttribute("style");
		System.out.println("The color code of box with title as 'Change Color' is " +buttonColor);
		
		//3. Count buttons on current page
		
		List <WebElement> list1 = driver.findElements(By.tagName("button"));
		System.out.println("Total number of buttons on current page are: "+list1.size());
		
		/*
		for(int j = 0; j < list1.size(); j++){
		System.out.println(list1.get(j).getText());
		}
		*/
		
		//4. To print the Text of 6th and last button elements on the page.
		
		//4.1 Text of 6th button on the page
		String buttonText = list1.get(5).getText();
		System.out.println("Text of 6th button on the page is " +buttonText);
		
		//4.2 Text of last button on the page
		//String lastButtonText = list1.get(8).getText();
		String lastButtonText = list1.get(list1.size()-1).getText();
		System.out.println("Text of last button on the page is " +lastButtonText);
		
		//5. To print all the links on the page along with the text
		
		//5.1 Count links on the page
		List <WebElement> list2 = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on current page are: "+list2.size());
		
		/*
		for(int k = 0; k < list2.size(); k++){
		System.out.println("Current index of link node is " + k + " and its text is " +list2.get(k).getText());
		}
		*/
		
		//5.2 Get node index of link from list
		int itr = 0;
		for (int k = 0; k < list2.size(); k++){
            if (list2.get(k).getText().equals("Setup First Project")){
            System.out.println("Node index of the list is " + k);
            itr = k+1;
            } 
          }
		
		System.out.println("Node index of selected link on the page is " +itr);
		
		//5.3 Get the text associated with link node
		String itrLinkText = list2.get(itr).getText();
		System.out.println("Text of selected link on the page is " +itrLinkText);
		
		
		//Close current window 
		driver.close();
						
		//Close all windows open from script
		driver.quit();

	}

}
