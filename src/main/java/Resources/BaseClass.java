package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
public Properties prop;
public WebDriver browserlaunch() throws IOException {
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	
	 prop=new Properties();
	
	prop.load(fis);
	
    String browsername=prop.getProperty("browser");

    if (browsername.equalsIgnoreCase("chrome"))
    {
    	 WebDriverManager.chromedriver().setup();
    	
    	   driver=new ChromeDriver();
    }
    else if (browsername.equalsIgnoreCase("firefox")) {
    	
    }
    else if (browsername.equalsIgnoreCase("edge")) {
    	
    }
    else
    {
    	System.out.println("Select");
    }
	return driver;
	
	
	
}
 
}
