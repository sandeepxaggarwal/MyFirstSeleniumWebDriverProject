import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class testSlider {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Actions action = new Actions(driver);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		//action.dragAndDropBy(slider, 500, 0).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
