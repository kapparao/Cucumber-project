package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "featureFiles/BackgroundExaple.feature", 
				 glue = {"stepDefination","hooks"},
				 dryRun=false,
				 monochrome = true,
				 plugin ={"pretty",
						 "html:report/WebReport.html",
						 "json:report/jsonreport.json",
						 "junit:report/junitreport.xml"}
				)
public class RunnerClass {

}
