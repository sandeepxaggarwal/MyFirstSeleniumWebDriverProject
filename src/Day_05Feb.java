import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Day_05Feb {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		//WebDriver driver = new FirefoxDriver();

		/*driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id='text2']"));
		//To find the dimension(Height and Width) of an element
		Dimension dim = last_name.getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		
		System.out.println(dim);
		
		
		System.out.println(last_name.getSize().getHeight());
		System.out.println(last_name.getSize().getWidth());
		
		//To find x and y co-ordinates of an element
		
		Point point = last_name.getLocation();
		
		
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		
		//How to find the existence of webelement in page
		
		Boolean isExists =driver.findElements(By.xpath("//*[@id='text2']")).size()!=0;
		System.out.println(isExists);
		
		//To retrieve the url of page
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		*/
		//Firefox Profile
		
	/*	ProfilesIni listprofiles = new ProfilesIni();
		FirefoxProfile profile  = listprofiles.getProfile("default");
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://newtours.demoaut.com");*/
		
		
		//How to use Sikuli
/*		
		Pattern Img1 = new Pattern("C:\\Selenium Tutorials\\Img3.png");
		Pattern Img2 = new Pattern("C:\\Selenium Tutorials\\Img4.png");
		
		Screen screen = new Screen();
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
		
		Thread.sleep(3000);
		screen.type("C:\\CaptureImage.bmp");
		
		screen.click(Img2);*/
		
		//Stale Element Reference Exception
		
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://github.com/");
		
		WebElement search_box = driver.findElement(By.name("q"));
		
		search_box.sendKeys("hello");
		search_box.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		search_box = driver.findElement(By.name("q"));
		search_box.clear();
		
		
		//Browser Navigation Commands
		
		driver.get("http://newtours.demoaut.com");
		
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
