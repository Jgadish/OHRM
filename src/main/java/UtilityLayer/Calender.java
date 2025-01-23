package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Calender {

	public static void selectMonthYear(WebElement mylist, String myvalue, WebElement next) {
		for(int i = 0;i<6;i++) {
		String str = mylist.getText();
		System.out.println(str+" "+myvalue);
		if (str.contains(myvalue)) {
			break;
			
		} 
		
		else {
			next.click();

		}

	}
	}

	public static void selectDate(List<WebElement> datelist, String datevalue) {

		for (WebElement date : datelist) {
			String str2 = date.getText();
			if (str2.contains(datevalue)) {
				date.click();
				break;
			}

		}
	}

}
