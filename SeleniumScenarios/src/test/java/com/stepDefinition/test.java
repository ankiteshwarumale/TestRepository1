package com.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("!");
		}


}
