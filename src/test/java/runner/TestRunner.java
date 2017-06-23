package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
glue = { "stepDefinition" },
plugin = { "html:reportes/cucumber-html-report-jefry" },
tags = {})
public class TestRunner {

}
