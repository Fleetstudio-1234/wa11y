package wa11y_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources.loginpage.feature", glue = "wa11y_stepDef",dryRun = false)
public class Runner_Class {

}
