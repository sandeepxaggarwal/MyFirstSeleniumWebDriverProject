import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webclass {

		 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://www.goibibo");
		  driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div[1]/ul/li[1]/a/span")).click();
		  Thread.sleep(20000);
		  driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
          //driver.findElement(By.className("wewidgeticon we_close")).click();
		  driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		  driver.switchTo().defaultContent();
		  //driver.findElement(By.cssSelector("input [value ='on']")).click();
		  driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Bhopal");
		  driver.findElement(By.id("gosuggest_inputDest")).sendKeys("delhi");
		 
		  driver.quit(); 
		 }
		 
    }
		

    
