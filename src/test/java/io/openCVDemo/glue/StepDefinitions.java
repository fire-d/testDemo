package io.openCVDemo.glue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
  private static final Logger logger = LogManager.getLogger(StepDefinitions.class);
  @Before
  public void setUp() {
    logger.info("Setting all tests up!");
  }

  @Given("the cell phone is active")
  public void the_cell_phone_is_active() {
    logger.info("Checking the cell phone is active!");
  }

  @When("I open the App")
  public void i_open_the_App() {
    logger.info("Opening the app!");
  }

  @Then("I should see the Main Activity")
  public void i_should_see_the_Main_Activity() {
    logger.info("Checking that the Main Activity is displayed correctly!");
  }

  @After
  public void tearDown() {
    logger.info("Cleaning up!");
  }
}
