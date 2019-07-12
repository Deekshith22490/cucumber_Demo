package marchcucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SeleniumScripts extends Reuseable_methods{
	@Test
	@Given("^User is on Sales force Page$")
	public void user_is_on_Sales_force_Page() throws Throwable {
		Reuseable_methods.InitializeDriver();
	    Reuseable_methods.Launch("https://login.salesforce.com/");
	}
	
//
//	@Given("^User enters \"([^\"]*)\" in user name field$")
//	public void user_enters_in_user_name_field(String username) throws Throwable {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	
	@Given("^User enters \"([^\"]*)\" in user name field$")
	public void user_enters_in_user_name_field(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}
	   
	

@Given("^User enters \"([^\"]*)\" in password field$")
	public void user_enters_in_password_field(String password) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(password);	   
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement login = findElement(By.xpath("//input[@value='Log In']"), "Login");
		clickObj(login, "Login");
	}

}
