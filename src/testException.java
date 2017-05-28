import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testException {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		//driver.switchTo().window("as");
		//driver.switchTo().frame("as");

		//driver.switchTo().alert();
		//driver.findElement(By.id("as"));
		
		//driver.findElement(By.xpath("/*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		//driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		driver.close();
		driver.findElement(By.name("userName"));
		
		
		
		
		
		
	}

}
