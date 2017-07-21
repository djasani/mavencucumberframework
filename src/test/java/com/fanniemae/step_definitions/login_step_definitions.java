package com.fanniemae.step_definitions;


import com.fanniemae.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login_step_definitions extends TestBase {

	@Given("^user is on sdettraining homepage$")
	public void user_is_on_sdettraining_homepage() throws Throwable {
	}

	@When("^user clicks on Signin link$")
	public void a_user_click_on_Signin_link() throws Throwable {
		click("id_login_button");
	}

	@When("^user enters \"([^\"]*)\" as username or email address$")
	public void user_enters_username_or_email_address(String username) throws Throwable {
		type("xpath_usernam_field", username);
	}
	

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_password(String password) throws Throwable {
		type("id_password_field", password);

	}

	@When("^user click on submit button$")
	public void user_click_on_signin_button() throws Throwable {
		Thread.sleep(3000);
		click("xpath_submit_button");
	}
	

	@Then("^user should see Welcome back message$")
	public void user_should_see_welcome_back_message() throws Throwable{
		Assert.assertEquals("Welcome back!", getText("xpath_welcomeback_message"));
	}


}
