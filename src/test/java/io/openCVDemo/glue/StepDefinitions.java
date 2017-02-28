package io.openCVDemo.glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
  @Before
  public void setUp() {
    System.out.println("Setting all tests up!");
  }

  @Given("the cell phone is active")
  public void the_cell_phone_is_active() {
    System.out.println("Checking the cell phone is active!");
  }

  @When("I open the App")
  public void i_open_the_App() {
    System.out.println("Opening the app!");
  }

  @Then("I should see the Main Activity")
  public void i_should_see_the_Main_Activity() {
    System.out.println("Checking that the Main Activity is displayed correctly!");
  }

  @After
  public void tearDown() {
    System.out.println("Cleaning up!");
  }
}
