package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void radioButton(List<WebElement> listwb, String value) {
		// System.err.println(listwb);
		for (WebElement wb : listwb) {
			String str = wb.getText();
			if (str.equals(value)) {
				wb.click();
				break;
			}

		}
	}

}
