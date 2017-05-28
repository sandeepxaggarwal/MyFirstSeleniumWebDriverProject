import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class getMovieNames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.findElement(By.xpath("//*[@id='qb-movie']")).click();
		Thread.sleep(2000);
		
		List<WebElement> allMovieNames = driver.findElements(By.xpath("//*[@id='qb-div-movie']/div/ul/li"));
		
		for(int i=0;i<allMovieNames.size();i++){
			System.out.println(allMovieNames.get(i).getText());
		}
		
		

	}

}
