package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iphonedemocart {

	public WebDriver driver;
	
 private By search=By.xpath("//input[@name='search']");
 private By searchclick=By.xpath("//i[@class='fa fa-search']");
 //private By doller=By.xpath("//p[@class='price']");
 // WebElement a=driver.findElement(By.xpath("//p[@class='price']"));
  
 private By addcart=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]") ;
 private By clearthe=By.xpath("//input[@name='search']");
 private By searchsamsung=By.xpath("//input[@name='search']");
 private By clicksamsung=By.xpath("//i[@class='fa fa-search']");
 private By addsamsung=By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
 private By add2item=By.xpath("//span[@id='cart-total']");

  
 
   public iphonedemocart(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	 this.driver=driver2;
    }


 
	 
 
        public WebElement search() {
		return driver.findElement(search);
	}
        public WebElement click() {
    		return driver.findElement(searchclick);
    	}
            
        public WebElement add() {
    		return driver.findElement(addcart);
    	}
        public WebElement clea() {
    		return driver.findElement(clearthe);
    	}
        public WebElement samsung() {
    		return driver.findElement(searchsamsung);
    	}
        public WebElement samsungclick() {
    		return driver.findElement(clicksamsung);
    	}
        public WebElement addsamsung() {
    		return driver.findElement(addsamsung);
    	}
        public WebElement additem() {
    		return driver.findElement(add2item);
    	}
	}


