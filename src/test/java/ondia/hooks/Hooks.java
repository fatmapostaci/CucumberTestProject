package ondia.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import ondia.utils.ParallelDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static ondia.utils.Driver.closeDriver;
import static ondia.utils.Driver.getDriver;

public class Hooks {

    @Before // Her Senaryodan önce çalışır  --> .io.cucumberdan import etmeli
    public void setUp(Scenario scenario) {
        System.out.println("Senaryo Başladı ...");
        System.out.println("Senaryo ID : " + scenario.getId());
        System.out.println("Senaryo Name : " + scenario.getName());
    }

    @After // Her Senaryo sonlandığında çalışır --> .io.cucumberdan import etmeli
    public void tearDown(Scenario scenario) {
        System.out.println("Senaryo sona erdi ...");

        if (scenario.isFailed()) {
            System.out.println("Senaryo Başarısız Oldu...");
            byte[] screenShot = ((TakesScreenshot) (getDriver())).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Başarısız Seneryo Ekran Görüntüsü");
            System.out.println("Ekran görüntüsü rapora eklendi ...");
            closeDriver();
        }
    }

}