package ondia.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failedScenarios.txt",
        glue = "ondia/stepdefinitions",
        tags = "@FailedScenario",
        dryRun = false,
        plugin = {

        "rerun:target/failedScenarios.txt",//Fail olan testleri bu text dosyasına yazar ve tekrar çalıştırılmalarına yardımcı olur.
        }

)
public class FailedScenarioRunner {

    //class içi boş kalacak
}
