package TestCaseData;

import java.io.IOException;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginTestxpath;
import PageObjectModel.Registerxpath;
 
import Resources.BaseClass;
import Resources.CommonUtilities;

public class Logintestcase extends BaseClass{
    @Test
	public void loginpage() throws IOException, InterruptedException{
	browserlaunch();	
    driver.get(prop.getProperty("url"));	
    
    Registerxpath R=new  Registerxpath (driver);
    R.components().click();
    
    LoginTestxpath C=new LoginTestxpath(driver);
    C.monitors().click();
    
   // Select s=new Select (C.defaut());
    //s.selectByIndex(1);
    Thread.sleep(5000);		
    CommonUtilities.dropdownHandle(C.defaut(),1);	
    CommonUtilities.dropdownHandle(C.sort(),1);
    Thread.sleep(2500);
    C.addcard().click();
    }}
 
	
	
	

