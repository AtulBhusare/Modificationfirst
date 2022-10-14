package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
    public Properties prop;
    public void browserlaunch() throws IOException {
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
	 
	//return driver;
    }
	
    @BeforeMethod
	public void Atul() throws IOException {
    browserlaunch();
    driver.get(prop.getProperty("url"));
}
    
  //  @AfterMethod
  //  public void method() {
   // 	driver.quit(); 5
  //  }
    
    
    }

