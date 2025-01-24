package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/com/AllFeatureFile",
		glue="LoginSteps",
		dryRun=false
		)

public class TestRuner extends AbstractTestNGCucumberTests{

}
