package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"AllFeatures"},
		glue = {"com.StepDefination"}
		)

public class RunnerTest {

}
