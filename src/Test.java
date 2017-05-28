import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\SW\\seleniumserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
*/
		
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login"));
		username.sendKeys("tutorial");
		password.sendKeys("tutorial");
		login.click();
		
		
		driver.findElement(By.xpath("//input[@name='userName']"));*/
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		
		//driver.findElement(By.partialLinkText("STER")).click();
		
	//	driver.close();
		//driver.quit();
		
		/*List<WebElement> allInputBoxes = driver.findElements(By.xpath("//input[@size='10']"));
		
		
		allInputBoxes.get(0).sendKeys("tutorial");
		*/
	
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		Select drpDown = new Select(driver.findElement(By.name("country")));
		
		
		
		//drpDown.selectByVisibleText("INDIA");
		
		//drpDown.selectByValue("6");
		
		//drpDown.selectByIndex(3);
		
		List<WebElement> allOptions = drpDown.getOptions();
		
		
		for(int i=0;i<allOptions.size();i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
