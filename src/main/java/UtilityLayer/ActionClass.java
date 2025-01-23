package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{
	
	
	protected static Actions act ;
	public static void sendKeys(WebElement wb, String value) {
		act = new Actions(driver);
		act.click().sendKeys(wb, value).build().perform();
		
	}
	
	public static void click(WebElement wb) {
		act = new Actions(driver);
		act.click(wb).perform();
}
	
}
