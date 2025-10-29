package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTest {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user is at login page");
	}
	@When("user enters invalid username {string} and password {string}")
	public void user_enters_invalid_username_and_password(String string, String string2) {
		System.out.println("username: "+string);
		System.out.println("password: "+string2);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicked on login button");
	}
	@Then("error message should be displayed {string}")
	public void error_message_should_be_displayed(String string) {
		System.out.println("landed on homepage");
	}

}
