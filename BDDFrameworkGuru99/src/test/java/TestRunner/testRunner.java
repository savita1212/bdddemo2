package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "AllFeatureFile/guru99.feature" }, glue = { "StepDefination" }

)

public class testRunner {

}
