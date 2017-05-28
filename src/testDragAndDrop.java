import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class testDragAndDrop {

	public static void main(String[] args) throws ATUTestRecorderException {
		
		ATUTestRecorder test = new ATUTestRecorder("C:\\", "TestVideo", false);
		test.start();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		
		action.dragAndDrop(draggable, dropable).build().perform();
		
		
		test.stop();
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
