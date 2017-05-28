import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class takeScreenshot {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		testUtil.captureScreenshot();
		//testUtil.captureScreenshot();
	}

}
