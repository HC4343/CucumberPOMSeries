package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"pretty",
				"html:target/default-cucumber-reports",
				"json:target/json-reports/cucumber.json"
		},
		features = "/Users/hakancetin/IdeaProjects/LatestCucumber6WithPOM/src/test/resources/parallel",
		glue = "parallel",
		dryRun = false,
		tags = "@regression"


)

public class MyTestRunner {

}
