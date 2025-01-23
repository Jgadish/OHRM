package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SelectValue {
	
	public static void selectvalues(List<WebElement> wblist, String value) {
		
		for(WebElement wb:wblist ) {
			
			String str = wb.getText();
			if(str.contains(value)) {
				wb.click();
				break;
			}
		}
	}

}
