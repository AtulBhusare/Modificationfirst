package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerxpath {
	public WebDriver driver;
   
	By MyAccount=By.xpath("//a[@title='My Account']");
	By Register=By.xpath("//li/a[contains(text(),'Register')]");
	By FirstName=By.xpath("//input[@name='firstname']");
	By LastName=By.xpath("//input[@name='lastname']");
	By Email=By.xpath("//input[@name='email']");
	By Telephone=By.xpath("//input[@name='telephone']");
	By password=By.xpath("//input[@name='password']");
	By confirmpassword=By.xpath("//input[@name='confirm']");
	By continu=By.xpath("//input[@value='Continue']");
	By Components=By.xpath("(//a[@class='dropdown-toggle'])[4]");
	
	public Registerxpath(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement myaccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement register() {
		return driver.findElement(Register);
	}
	
	public WebElement fierstnam () {
		return driver.findElement(FirstName);
	}
	public WebElement lastname() {
		return driver.findElement(LastName);
	}
	public WebElement email() {
		return driver.findElement(Email);
	}
	public WebElement telephone() {
		return driver.findElement(Telephone);
	}
	
	public WebElement password(){
		return driver.findElement(password);
	}
	public WebElement conpassword() {
		return driver.findElement(confirmpassword);
	}
	public WebElement continu() {
		return driver.findElement(continu);
	}
	public WebElement components(){
		return driver.findElement(Components); 
	}
} 
