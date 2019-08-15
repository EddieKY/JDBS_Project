package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumberreports","json: target/report.json"},
//        "html:target/cucumber",
        features = "src/test/features",
        glue = "steps",
        tags = "@student",
        dryRun = false
//        true    false

)
public class Runner {

}


