import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Day_12Feb {
	/*static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException {
		
		driver = new FirefoxDriver();
		System.out.println(System.getProperty("user.dir"));
		
		//Below command is used to load the OR.properties file
		//prop.load(fis);
		
		driver.get("http://newtours.demoaut.com");
		
		System.out.println(prop.getProperty("userID"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("signin"));
		driver.findElement(By.name(prop.getProperty("userID"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("pass"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("signin"))).click();
		
		findElement("userID").sendKeys("tutorial");;
		findElement("pass").sendKeys("tutorial");;
		findElement("signin").click();;
		
		
	}
	
	
	public static WebElement findElement(String key) throws IOException{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		return driver.findElement(By.name(prop.getProperty(key)));
	}
*/	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.homeshop18.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement main_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']"));
		
		WebElement sub_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']/ul/li[2]/ul[1]/li[4]/a"));
		
		action.moveToElement(main_menu).build().perform();
		Thread.sleep(2000);
		
		sub_menu.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
