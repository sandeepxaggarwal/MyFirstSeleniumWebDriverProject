import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebsiteContent {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
