import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day_11Feb {

	public static void main(String[] args) {
/*		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//How to maximize window
		
		driver.manage().window().maximize();
		
		//How to use Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		
		//Explici Wait
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("password")));
		
		//driver.findElement(By.name("pass")).sendKeys("tutorial");
		
		
		//Fluent Wait
		
		  Wait wait = new FluentWait(driver)
	       .withTimeout(30, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class)
	       .withMessage("User defined wait");
		
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Softwares\\SW\\seleniumserver\\IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://newtours.demoaut.com");
		*/
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/a")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterate = allWindowHandles.iterator();
		
		String winID1 = iterate.next();
		String winID2 = iterate.next();
		
		System.out.println(winID1);
		System.out.println(winID2);
		
		driver.switchTo().window(winID2);
		driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/form[1]/input[5]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
