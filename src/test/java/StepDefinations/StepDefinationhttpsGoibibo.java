package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.ActionClass;
import UtilityLayer.Calender;
import UtilityLayer.SelectValue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationhttpsGoibibo extends BaseClass{

	@Given("user open the {string} link and click on cancel signup button")
	public void user_open_the_link_and_click_on_cancel_signup_button(String browser) {
		BaseClass.initialization(browser);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	}

	
	@When("user Enter {string} From city and {string} To City")
	public void user_enter_from_city_and_to_city(String From, String To) throws InterruptedException {
		
		WebElement fromlocation = driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"));
		ActionClass.sendKeys(fromlocation, From);
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/child::li"));
		SelectValue.selectvalues(from, From);
		Thread.sleep(3000);
		WebElement tolocation = driver.findElement(By.xpath("//span[text()='To']/following-sibling::p"));
		ActionClass.sendKeys(tolocation, To);
		List<WebElement> to = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/child::li"));
		SelectValue.selectvalues(to, To);
		
		WebElement clickwb = driver.findElement(By.xpath("//div[@class='gr_fswFld active']/child::p[@class='fswFld__title']"));
		ActionClass.click(clickwb);
	}

	@When("user select Departure {string} Date and {string} MonthYear")
	public void user_select_departure_date_and_month_year(String Departuremonthyear, String departureDate) throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement my = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/following-sibling::div"));
		WebElement next = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		Calender.selectMonthYear(my, Departuremonthyear, next);
		
		
		List<WebElement> DepartureDate = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/following-sibling::div/descendant::div[@class='DayPicker-Day']"));
		Calender.selectDate(DepartureDate, departureDate);
		
	}

	@When("user Select Return {string} Date and {string} MonthYear")
	public void user_select_return_date_and_month_year(String Returnmonthyear, String ReturnDate) {
		driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
		WebElement my = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/following-sibling::div"));
		WebElement next = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		Calender.selectMonthYear(my, Returnmonthyear, next);
		
		
		List<WebElement> DepartureDate = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/following-sibling::div/descendant::div[@class='DayPicker-Day']"));
		Calender.selectDate(DepartureDate, ReturnDate);
	}


	
}
