import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class testIncognito {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("-incognito");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\SW\\seleniumserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://145.cargoflash.com/GAtest/Account/Login.cshtml");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("@Admin123");
		
		driver.findElement(By.xpath("//*[@id='LogInBtn']")).click();
		
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

	}

}
