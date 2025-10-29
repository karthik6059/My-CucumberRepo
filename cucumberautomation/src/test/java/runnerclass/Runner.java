package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",glue = "stepdefinition", monochrome = true, plugin = {"pretty","html:reports/testreport.html"})
public class Runner {
	//this is an runner class file
}
