import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testDeluxeMenu {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("//p[2]/img"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(img).perform();
		Thread.sleep(1000);
		
		WebElement prodInfo = driver.findElement(By.xpath("//td[contains(@id,'dm2m1i1tdT')]"));
		action.moveToElement(prodInfo).build().perform();
		Thread.sleep(1000);
		WebElement install = driver.findElement(By.xpath("//td[contains(@id,'dm2m2i1tdT')]"));
		action.moveToElement(install).build().perform();
		WebElement howtosetup = driver.findElement(By.xpath("//td[contains(@id,'dm2m3i1tdT')]"));
		howtosetup.click();
		}
	}