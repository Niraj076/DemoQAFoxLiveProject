package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.java.en.*;

public class Register {

	@Given("I launch the application")
	public void i_launch_the_application() {
	   
		Base.driver.get(Base.reader.getUrl());
	}

	@And("I navigate to Account Registeration page")
	public void i_navigate_to_account_registeration_page() {
	  
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I provide all the below details")
	public void i_provide_all_the_below_details(io.cucumber.datatable.DataTable dataTable) {
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@And("I select the Privacy Policy")
	public void i_select_the_privacy_policy() {
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@And("I click on Continue button")
	public void i_click_on_continue_button() {
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I should see that  the user account has created successfully")
	public void i_should_see_that_the_user_account_has_created_successfully() {
	    
	    //throw new io.cucumber.java.PendingException();
	}
}
