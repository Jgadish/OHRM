package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.RadioButton;
import UtilityLayer.SelectClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationFacebook extends BaseClass {

	// protected static WebDriver driver;
	@Given("User is on {string} Registration Page")
	public void user_is_on_registration_page(String url) {
		BaseClass.initialization(url);
		// BaseClassFacebook.initialization();
	}

	@When("user Enter {string} FirstName and {string} LastName")
	public void user_enter_first_name_and_last_name(String fname, String lname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
	}

	@When("user Select {string} Date and {string} Month and {string} Year")
	public void user_select_date_and_month_and_year(String Date, String Month, String Year) {
		WebElement date = driver.findElement(By.name("birthday_day"));
		SelectClass.selectDropDown(date, Date);

		WebElement month = driver.findElement(By.name("birthday_month"));
		SelectClass.selectDropDown(month, Month);

		WebElement year = driver.findElement(By.name("birthday_year"));
		SelectClass.selectDropDown(year, Year);
	}

	@When("user Select {string} gender")
	public void user_select_gender(String gender) {

		List<WebElement> genderlist = driver
				.findElements(By.xpath("//span[@data-name='gender_wrapper']/descendant::label"));
		RadioButton.radioButton(genderlist, gender);
	}

	@When("User Enter {string} Email and {string} Password")
	public void user_enter_email_and_password(String emailid, String password) {
		driver.findElement(By.name("reg_email__")).sendKeys(emailid);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}

}