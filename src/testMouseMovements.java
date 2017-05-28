import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class testMouseMovements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		WebElement main_menu = driver.findElement(By.name("userName"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(main_menu)
				.contextClick()
				.build();
		seriesOfActions.perform();
				
				
				
	}

}
