
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshotelement {
	public static void main(String[] args) throws IOException {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
			WebElement drop = driver.findElement(By.xpath(".//*[@id='Carlist']"));
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			Point point =drop.getLocation();
			int xcord=point.getX();
			int ycord=point.getY();
			Dimension dim =drop.getSize();
			int height =dim.getHeight();
			int width =dim.getWidth();
			 
			//Java 8
			

	}

}