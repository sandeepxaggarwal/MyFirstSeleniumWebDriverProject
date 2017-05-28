import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class readObjectProperties {
	
	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("C:\\WebDriverWorkspace\\MyFirstWebDriverProject\\src\\Object.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Object.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("password"));
	}

}
