import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testkalvie {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://kalvie.com");
		
		driver.findElement(By.xpath("//*[@id='loginclick']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		String todisable = "document.evaluate('/html/body/div[1]/div/div/div[2]/div[2]',document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.setAttribute('style','display:false');";
		js.executeScript(todisable);
		
	}

}
