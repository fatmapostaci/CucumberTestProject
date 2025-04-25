package ondia.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",   //konsola daha güzel renkli yazdırır
                "html:target/cucumber-report.html",

                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatında rapor için
                "json:target/reports/json-reports/cucumber1.json",//json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatında rapor için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//Spark Report için

                "rerun:target/failedScenarios.txt",//Fail olan testleri bu text dosyasına yazar ve tekrar çalıştırılmalarına yardımcı olur.
                 },
        features = "src/test/resources/features",
        glue = {"ondia/stepdefinitions","ondia.hooks"},
 //          tags = "@ScenarioOutline",   //belli tagleri çalıtıracak, featurelara tag vereceğim
        //   tags = "@NegativeLogin",
        tags = "@FormScenario",
//        tags = "@ToDoList",
//        tags = "@FormMap",
//        tags = "@FormListOfList",
//        tags = "@FormListOfListWithTitle",
//        tags = "@Hw01",
  //      tags = "@FailedScenario",
//        tags = "@PositiveLogin",
//        tags="@Parallel",
//        tags="@Parallel01",
  //          tags = "@DataTableExample01",
 //       tags="@PositiveLogin",
        dryRun = false
)
public class Runner {

    //class içi boş kalacak
}
