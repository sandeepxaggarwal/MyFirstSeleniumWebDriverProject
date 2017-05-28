import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Day_04Feb {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		/*Select multiselectbox = new Select(driver.findElement(By.name("FromLB")));
		
		multiselectbox.selectByVisibleText("Japan");
		multiselectbox.selectByVisibleText("India");
		multiselectbox.selectByVisibleText("Malaysia");
		
		Thread.sleep(4000);
		
		multiselectbox.deselectByVisibleText("Japan");
		multiselectbox.deselectByValue("India");
		multiselectbox.deselectByIndex(8);
		
		Thread.sleep(4000);
		
		multiselectbox.selectByVisibleText("Japan");
		multiselectbox.selectByVisibleText("India");
		multiselectbox.selectByVisibleText("Malaysia");
		
		Thread.sleep(4000);
		
		multiselectbox.deselectAll();
		*/
		
		
		//Select drpdown = new Select(driver.findElement(By.xpath("//*[@id='Carlist']")));
		
		//System.out.println(drpdown.getFirstSelectedOption());
	
		//drpdown.getAllSelectedOptions();
		
	/*	System.out.println(driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='check1']")).getAttribute("id"));
		
		System.out.println(driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getTagName());
	
		
		WebElement chk_box = driver.findElement(By.xpath("//*[@id='check3']"));
		
		System.out.println(chk_box.isSelected());
		chk_box.click();
		System.out.println(chk_box.isSelected());
		
		
		if(chk_box.isSelected()){
			System.out.println("It is already selected");
		}else{
			chk_box.click();
		}
		
		
		System.out.println(chk_box.isDisplayed());
		System.out.println(chk_box.isEnabled());
		
		
		WebElement radio_btn = driver.findElement(By.xpath("//*[@id='radio1']"));
		System.out.println(radio_btn.isSelected());
		System.out.println(radio_btn.isDisplayed());
		System.out.println(radio_btn.isEnabled());
		radio_btn.click();
		
		
		//How to capture screenshot
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\CaptureImage.bmp"));
		*/
		
		//How to handle Alerts
		
		/*driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();*/
		
		/*
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("sandeep");
		
		Thread.sleep(4000);
		
		//alert.dismiss();
		
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		alert = driver.switchTo().alert();
		
		alert.sendKeys("sandeep");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		
		Thread.sleep(3000);
		
		alert.accept();*/
		
		WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		System.out.println(allRows.size());
		
		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		
		List<WebElement> allCols = row.findElements(By.tagName("td"));
		System.out.println(allCols.size());
		
		for(int i=1;i<=allRows.size();i++){
			//Colcount for dynamic webtable
			//allRows.get(i).findElements(By.tagName("td")).size();
			for(int j=1;j<=allCols.size();j++){
				System.out.print(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr["+ i + "]/td[" + j + "]")).getText());
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
