package TestCaseData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.iphonedemocart;
import Resources.BaseClass;

   public class verifyiphonetestcase extends BaseClass{
	    @Test
		public void verifyiphonedemo() throws IOException, InterruptedException{
		//browserlaunch();	
	    //driver.get(prop.getProperty("url"));	
	    
	    iphonedemocart v=new  iphonedemocart (driver);
	    v.search().sendKeys("iphone");
	   
	    v.click().click(); 
	    WebElement a=driver.findElement(By.xpath("//p[@class='price']"));
	    String cost=a.getText();
	    String []ab=cost.split(" ");
	    String iphonepriceconvert=ab[0].replaceAll("[^\\d.]", "");
	    System.out.println(iphonepriceconvert);
	    Thread.sleep(4000);
	    
        v.add().click();  
		v.clea().clear();
		v.samsung().sendKeys("samsung");
	    v.samsungclick().click();
	    WebElement b=driver.findElement(By.xpath("(//p[@class='price'])[1]"));
	    String costsamsung=b.getText();
	    String []ac=costsamsung.split(" ");
	    String samsungpriceconvert=ac[0].replaceAll("[^\\d.]", "");
	    System.out.println(samsungpriceconvert);
	    
		v.addsamsung().click();
		double iphonefinalprice=Double.parseDouble(iphonepriceconvert);
		double samsungfinalprice=Double.parseDouble(samsungpriceconvert);
		double totalprice=iphonefinalprice + samsungfinalprice;
		System.out.println(totalprice);
		Thread.sleep(4000);
		v.additem().click();
		
		
		 WebElement c=driver.findElement(By.xpath("(//td[@class='text-right'])[12]"));
		     
		     String costfinal=c.getText();
		     String []ad=costfinal.split(" ");
		     String totleconvert1=ad[0].replaceAll("[^\\d.]", "");
		     double cartlastfinle=Double.parseDouble(totleconvert1);
		    if (totalprice==cartlastfinle) {
		    System.out.println("successfully u match the price");	
		    }
		    else {
		    	System.out.println("Better Luck Next Time");
		    }
		     
		     
		     
	}
}

