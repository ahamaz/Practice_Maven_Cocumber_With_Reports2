package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
glue= {"steps"}
//Create an HTML Report By Adding A Plugin To Testrunner.Java Class
//plugin = { "pretty", "html:target/htmlreports" }

//Create HTML Report By Using Extent-Reports. Add plugin in POM file. lll
//plugin = {"json:target/cucumber.json"}
)

public class TestRunner {
	//Create HTML Report By Using Extent-Reports. 2/2
//    @AfterClass
//    public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File("config/report.xml"));
}
