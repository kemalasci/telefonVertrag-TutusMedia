package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/java/features/DslPages.feature","src/test/java/features/HomePageTariffs.feature"},
                glue = {"stepDefs"},
                dryRun = false
        )

public class runners extends AbstractTestNGCucumberTests {
}
