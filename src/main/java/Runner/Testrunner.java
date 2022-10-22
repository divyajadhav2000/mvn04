package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\Feature\\xyz.feature"  ,
		glue = "StepDefi",
		tags="@Regression",
		plugin = {"pretty"}
		)
public class Testrunner {

}

//"json:target/myreport/report.json"
//"junit:target/junitreport/report.xml"