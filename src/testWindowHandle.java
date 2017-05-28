import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/a")).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		/*for(String windowhandle : allWindowHandles){
			System.out.println(windowhandle);
		}*/
		
		Iterator<String> iterate = allWindowHandles.iterator();
		String winid1= iterate.next();
		String winid2= iterate.next();
		driver.switchTo().window(winid2);
		driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/form[1]/input[5]")).click();
		
		while(iterate.hasNext()){
			String[] x = new String[5];
			x[0] = iterate.next();
			//System.out.println(iterate.hasNext());
		}
		
	}

}
