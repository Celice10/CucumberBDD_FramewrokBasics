package runners;


import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)                             //Use Cucumber to run the tests

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.xml"},
        monochrome = true
)

public class TestRunner {


}
