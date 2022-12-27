package sprintOne_newproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Index.html");
		System.out.println("the title is : "+driver.getTitle());
		
		List<WebElement> myOptions =driver.findElements(By.tagName ("option"));
		int v ;
		for (int i = 0 ; i< myOptions.size();i++) {
			v= i+1;
			
			System.out.println("element # "+ v  +"   "+myOptions.get(i).getText());
			
		}
		
	}

}
