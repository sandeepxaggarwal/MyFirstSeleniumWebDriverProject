import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class scrollEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		
		//javascript.executeScript("window.scrollBy(0,600)", "");
		/*javascript.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		javascript.executeScript("window.scrollBy(0,-1500)","");*/
		
		WebElement element = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		javascript.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}

}
