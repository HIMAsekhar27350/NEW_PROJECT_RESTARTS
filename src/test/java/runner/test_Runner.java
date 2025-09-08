package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src\\test\\java\\Features\\loginPage.feature"},glue = {"StepDenfinitions"},
        monochrome = true)
public class test_Runner extends AbstractTestNGCucumberTests {
}
