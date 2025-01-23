package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseLayer.BaseClass;
import UtilityLayer.SelectClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationSaucedemo extends BaseClass {

	// protected static WebDriver driver;

	@Given("user is on {string} login page")
	public void user_is_on_login_page(String url) {

		BaseClass.initialization(url);

	}

	@When("user enter {string} username  and {string} password")
	public void user_enter_username_and_password(String username, String password) {
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.name("login-button")).click();
	}

	@Given("user is on Product Page")
	public void user_is_on_product_page() throws InterruptedException {

		String str = driver.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(str, "Products");
		Thread.sleep(5000);
	}

	@When("user Select {string} from Drop Down")
	public void user_select_from_drop_down(String value) {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		SelectClass.selectDropDown(dropdown, value);

	}

	@When("User Add {int} Product To Cart")
	public void user_add_product_to_cart(Integer addcart) throws InterruptedException {

		List<WebElement> lists = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for (int i = 0; i < addcart; i++) {
			lists.get(i).click();
		}

		Thread.sleep(5000);
	}

	@Then("user Click On Container")
	public void user_click_on_container() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

	@Then("user Click on Checkout")
	public void user_click_on_checkout() {
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	}

	@When("user Enter {string} FirstName and {string} lastName and {string} Postalcode")
	public void user_enter_first_name_and_last_name_and_postalcode(String fname, String lname, String pincode) {

		driver.findElement(By.name("firstName")).sendKeys(lname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.name("postalCode")).sendKeys(pincode);

	}

	@When("user Click on Continue")
	public void user_click_on_continue() {
		driver.findElement(By.name("continue")).click();
	}

	@When("user click on Finish")
	public void user_click_on_finish() {
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
	}

}

