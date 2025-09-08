package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src\\test\\java\\Features\\test_login.feature"},glue = {"StepDenfinitions"},
        monochrome = true)
public class test_Runner extends AbstractTestNGCucumberTests {
}
