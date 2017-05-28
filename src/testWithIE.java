import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class testWithIE {

	public static void main(String[] args) {

		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Softwares\\SW\\seleniumserver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://newtours.demoaut.com");

	}

}
