package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features = "src/features",
//		tags = { },
		glue = {"stepdefinitions"},
		plugin = {"pretty"}
		)

public class TestRunner {

}
