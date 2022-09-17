package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtilities {
	 public static void dropdownHandle(WebElement dropdownXpath,int index)
     {
	  Select s=new Select(dropdownXpath);
	  s.selectByIndex(index);
}
}