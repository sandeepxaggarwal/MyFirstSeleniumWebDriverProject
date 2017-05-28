import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class openTab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//driver.navigate().to("http://google.com");

	}

}
