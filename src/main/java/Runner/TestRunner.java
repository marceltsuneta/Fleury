package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\marce\\eclipse-workspace\\UnidadesFleury\\src\\main\\java\\Features\\login.feature",
		glue= {"StepDefinitions"}, 
		format = {"pretty", "html:test-outout", "json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"}
		)
	

	public class TestRunner {
	
	
}
