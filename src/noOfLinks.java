import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class noOfLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of Links in Google HomePage -> " + allLinks.size());
		
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText());
			
		}

	}

}
