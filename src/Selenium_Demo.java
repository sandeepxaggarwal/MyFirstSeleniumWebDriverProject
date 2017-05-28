import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Demo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).clear();

		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("password")).sendKeys("tutorial");

		driver.findElement(By.name("login")).click();
		
		//How to capture screenshot
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Screenshot_MercuryTours1.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
