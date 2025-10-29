package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class WithoutHeader {
	@Given("users at login page of the application")
	public void users_at_login_page_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user on login page");
	}
	@When("user enter the details {string} and {string}")
	public void user_enter_the_details(String usernName , String password) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		System.out.println(usernName+" | "+password);
		if(usernName.equalsIgnoreCase("karthik")) {
			throw new io.cucumber.java.PendingException();
		}
	}
	@When("click login button on the page")
	public void click_loginbutton_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user clicked on login button");
	}

}
