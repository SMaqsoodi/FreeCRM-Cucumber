package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

// we must pass the feature file or folder path to CucumberOptiosn
@CucumberOptions(features="/home/saeed/DevOps/Learning-Java/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features", // the path for the feature folder or files
				glue={"stepDefinition"}, // path to step def folder or files
				format= {"pretty", "html:test-output", "json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml"}, // we can generate report in html, json and xml format
				monochrome=true,   // generates more readable output format in console
				strict=true, // unlike dryRun, strict does not check the mapping first and run the steps, throws pending exception if there is any mapping missed
				dryRun=false) // does not run steps, just checks the mapping between feature file/s and step definition file/s

public class TestRunner {

}
