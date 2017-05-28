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


public class Day_27May {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		/*
		//driver.findElement(By.xpath("//*[@id='check3']")).click();
		
		WebElement chk_box = driver.findElement(By.xpath("//*[@id='check3']"));
		
		System.out.println(chk_box.isSelected());
		
		
		if(chk_box.isSelected()){
			System.out.println("Check box is already checked");
		}else{
			chk_box.click();
		}
		Day_27May obj = new Day_27May();
		obj.selectCheckBox(chk_box);
		selectCheckBox(chk_box);
		selectCheckBox(chk_box);
		if(chk_box.isSelected()){
			System.out.println("Check box is already checked");
		}else{
			chk_box.click();
		}
		
		System.out.println(chk_box.isDisplayed());
		System.out.println(chk_box.isEnabled());
		
		WebElement radio_btn = driver.findElement(By.xpath("//*[@id='radio1']"));
		
		System.out.println(radio_btn.isSelected());
		
		if(radio_btn.isSelected()){
			System.out.println("Radio btn is already selected");
		}else{
			radio_btn.click();
		}
		
		System.out.println(radio_btn.isDisplayed());
		System.out.println(radio_btn.isEnabled());
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText());*/
		
		/*driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		
		Alert x = driver.switchTo().alert();
		
		System.out.println(x.getText());
		
		x.accept();
		
		*/
		
		/*
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		
		Alert x = driver.switchTo().alert();
		
		//x.sendKeys("sandeep");
		Thread.sleep(3000);
		//x.dismiss();
		x.accept();
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		x = driver.switchTo().alert();
		
		x.sendKeys("abhishek");
		Robot y = new Robot();
		y.keyPress(KeyEvent.VK_TAB);
		y.keyPress(KeyEvent.VK_SPACE);*/
		
		/*WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		
		WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		List<WebElement> allColumns = row.findElements(By.tagName("td"));
		
		System.out.println(allColumns.size());
		
		String first_part= "//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[";
		String second_part="]/td[";
		String third_part="]";
		
		for(int i=1;i<=allRows.size();i++){
			for(int j=1;j<=allColumns.size();j++){
				System.out.print(driver.findElement(By.xpath(first_part+i+second_part+j+third_part)).getText());
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		//How to maximize the window
		
	/*	driver.manage().window().maximize();
		//Browser Navigation commands
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		
		//How to find out whether element exists on page or not
		/*Boolean isElementPresent= driver.findElements(By.xpath("c")).size()!=0;
		System.out.println(isElementPresent);
		
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='text200']"));
		allElements.size();*/
		
		//differences between findElement and findElements
		//driver.findElements(By.xpath("//*[@id='text50']"));
		
		//How to capture screenshot of page
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\TakePicture.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	public static void selectCheckBox(WebElement checkbox){
		if(checkbox.isSelected()){
			System.out.println("checkbox is already selected");
		}else{
			checkbox.click();
		}
	}

}
