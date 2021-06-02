package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/LoginFeature/Login.feature"}, glue = {"login.cucumber"}, tags={"@Test1,@Test2"})
public class RunTest {
}
