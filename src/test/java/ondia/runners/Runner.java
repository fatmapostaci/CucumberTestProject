package ondia.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "ondia/stepdefinitions",
     //   tags = "@ScenarioOutline",   //belli tagleri çalıtıracak, featurelara tag vereceğim
        //   tags = "@NegativeLogin",
//        tags = "@FormScenario",
//        tags = "@ToDoList",
//        tags = "@FormListOfList",
        tags = "@Hw01",
        dryRun = false

)
public class Runner {

    //class içi boş kalacak
}
