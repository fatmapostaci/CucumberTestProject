package ondia.stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import static ondia.utils.Driver.getDriver;

public class Google_stepdefinitions {

    @When("Kullanıcı google ana sayfasını ziyaret eder")
    public void kullanıcı_google_ana_sayfasını_ziyaret_eder() {
        getDriver().get("https://google.com");
    }
    @Then("sayfa title ı google içerir")
    public void sayfa_title_ı_google_içerir() throws InterruptedException {
        Thread.sleep(2000);
        String title = getDriver().getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Google"));
    }
    @Then("Search box ın görünürlügünü dogrular")
    public void search_box_ın_görünürlügünü_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(getDriver().findElement(By.name("q")).isDisplayed());
    }

    @And("browserı kapatır")
    public void browserıKapatır() {
        System.out.println("Browser kapatılıyor");
        getDriver().quit();
    }

    @And("Ekrana Dry yazar")
    public void ekranaDryYazar() {
        System.out.println("Dry");
    }

    @Then("ekrana selam yazar")
    public void ekrana_selam_yazar() {
        System.out.println("Selam");
    }


}