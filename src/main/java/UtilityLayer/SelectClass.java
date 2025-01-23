package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void selectDropDown(WebElement wb, String vlaue) {
	
		Select sel = new Select(wb);
		sel.selectByVisibleText(vlaue);
	
	
	}
}
