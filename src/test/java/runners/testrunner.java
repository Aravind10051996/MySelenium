package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 
@CucumberOptions(
		dryRun = false, 
		glue = { "test.stepdefinition" },
		features = {"C://Users/KSPL/eclipse-workspace/MySeleniumProject/features"},
		//tags= {"@Test"},
		/*plugin = {
				"json:target/cucumber-reports/cucumber-html-report.json", 
				"usage:target/cucumber-reports/cucumber-usage.json",
				"rerun:target/cucumber-reports/failedscenarios.txt" })
*/
		plugin = {"pretty","html:target/htmlreport.html"})

public class testrunner extends AbstractTestNGCucumberTests {

}