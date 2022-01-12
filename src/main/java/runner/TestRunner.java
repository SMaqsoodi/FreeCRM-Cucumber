package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

// we must pass the feature file path to CucumberOptiosn
@CucumberOptions(features="/home/saeed/DevOps/Learning-Java/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features/login.feature",
				glue={"stepDefinition"},
				format= {"pretty", "html:test-output"})

public class TestRunner {

}
