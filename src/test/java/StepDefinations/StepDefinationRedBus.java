package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.Calender;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationRedBus extends BaseClass{
	
	@Given("user open {string} url and user on home page")
	public void user_open_url_and_user_on_home_page(String url) {
		BaseClass.initialization(url);
	}

	@When("user Enter {string} From city and {string} To city")
	public void user_enter_from_city_and_to_city(String from, String to) {
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(from);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(to);
	    
	}

	@When("user select {string} Date and {string} monthyear")
	public void user_select_date_and_monthyear(String date, String monthyear) {
		driver.findElement(By.xpath("//div[@class='sc-fjdhpX elUAqf']")).click();
		
		WebElement monthyearlist = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]"));
		WebElement nextclick = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]"));
		Calender.selectMonthYear(monthyearlist, monthyear, nextclick);
		
		List<WebElement> datelist = driver.findElements(By.xpath("//span[contains(@class, 'bwoYtA') or contains(@class, 'dkWAbH')]"));
		Calender.selectDate(datelist, date);
	}

	@Then("user click on search button")
	public void user_click_on_search_button() {
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
	}


	

}
