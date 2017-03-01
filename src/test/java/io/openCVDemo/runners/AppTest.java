package io.openCVDemo.runners;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/OpenApp.feature",
    glue = "io.openCVDemo.glue", format = {"pretty"})
public class AppTest extends AbstractTestNGCucumberTests {
}
