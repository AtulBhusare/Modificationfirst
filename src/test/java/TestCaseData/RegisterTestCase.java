package TestCaseData;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Registerxpath;
import Resources.BaseClass;
import Resources.Testcasedata;

public class RegisterTestCase extends BaseClass {
  //public WebDriver driver;
 
   @Test
   public void Register() throws IOException {

   browserlaunch(); 
  // driver.get("https://naveenautomationlabs.com/opencart/");
 driver.get(prop.getProperty("url"));
	Registerxpath R=new  Registerxpath (driver);
    R.myaccount().click();
    R.register().click();
    R.fierstnam().sendKeys(Testcasedata.firstname);
    R.lastname().sendKeys(Testcasedata.lastname);
    R.email().sendKeys(Testcasedata.email);
    R.telephone().sendKeys(Testcasedata.telephone);
    R.password().sendKeys(Testcasedata.paas);
    R.conpassword().sendKeys(Testcasedata.cpaas);
    R.continu().click();
    
    String expected="Warning: You must agree to the Privacy Policy!";
    String actual=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
    
    SoftAssert assertion=new  SoftAssert();
    Assert.assertEquals(actual, expected);
    assertion.assertAll();
    
}
}
