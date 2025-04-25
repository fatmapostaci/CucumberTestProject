package ondia.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "ondia/stepdefinitions",
        tags = "@Parallel02",
        dryRun = false,
        plugin = {
                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatında rapor için
                "json:target/reports/json-reports/cucumber1.json",//json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatında rapor için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//Spark Report için
                "rerun:target/failedScenarios.txt",//Fail olan testleri bu text dosyasına yazar ve tekrar çalıştırılmalarına yardımcı olur.
                "pretty"//Konsola daha güzel renkli yazdırma yapar.
        }

        //monochrome = true


)
public class ParallelRunner02 {
}
