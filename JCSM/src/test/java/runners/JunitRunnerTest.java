package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html",},
        features = "src/test/java/resources/featurefiles",
        glue = {"stepdefinitions", "hooks"},
        monochrome = true,
        tags = "",
        publish = true)
public class JunitRunnerTest {

}
