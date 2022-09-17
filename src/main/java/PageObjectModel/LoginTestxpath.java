package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class LoginTestxpath {
	public WebDriver driver;
	
	By Monitors=By.xpath("//li/a[contains(text(),'Monitors ')]");
	By defaut=By.xpath("//select[@id='input-sort']");
	By sort=By.xpath("//select[@id='input-limit']");
	By addcard=By.xpath("(//button[@type='button'])[9]");
	
	public LoginTestxpath(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
	 
	public WebElement monitors() {
		return driver.findElement(Monitors);
	}
	public WebElement defaut() {
		return driver.findElement(defaut);
	}
	public WebElement sort() {
		return driver.findElement(sort);
	}
	public WebElement addcard() {
		return driver.findElement(addcard);
	}
	
}
