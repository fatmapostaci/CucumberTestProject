package ondia.stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import ondia.pages.MentoringEviltesterPage;
import ondia.utils.ConfigReader;
import ondia.utils.Driver;
import org.junit.Assert;

import static ondia.utils.Driver.getDriver;

public class Mentoring_stepdefinitions {

    @Given("Go to eviltester")
    public void go_to_eviltester() {
        Driver.getDriver().get(ConfigReader.getProperty("eviltesterUrl"));
    }

    @And("Page title should contain HTML")
    public void pagetitle_should_contain_html() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Practice"));

    }

    @Then("Close driver")
    public void closeDriver() {
        System.out.println("Browser kapatılıyor");
        Driver.closeDriver();
    }

    MentoringEviltesterPage eviltesterPage = new MentoringEviltesterPage();

    @When("Click TableTestPage Link")
    public void clickTableTestPageLink() {

        eviltesterPage.clickTableTestLink();
    }

    @And("Table Should Contain Aleister")
    public void tableShouldContainAleister() {

       Assert.assertTrue( eviltesterPage.findName(ConfigReader.getProperty("name"))  );
    }

    @And("Table Should Contain {string}")
    public void tableShouldContain(String arg0) {

        Assert.assertTrue( eviltesterPage.findName(arg0) );
    }

    @Then("The amount for Bob should be twenty three")
    public void theAmountForBobShouldBeTwentyThree() {

        Assert.assertEquals("23", eviltesterPage.amountOfBob());
    }

    @Then("Table should have {int} rows")
    public void tableShouldHaveRows(int expectedRowNumber) {
        Assert.assertEquals( expectedRowNumber, eviltesterPage.countNumberOfRows());
    }

    @Then("Table should contain {string} amount")
    public void tableShouldContainAmount(String arg0) {

        Assert.assertTrue(eviltesterPage.findACellInWebtable(arg0));
    }

    @Then("Table should not contain a row with name {string}")
    public void tableShouldNotContainARowWithName(String arg0) {

        Assert.assertFalse(eviltesterPage.findName(arg0));
    }
}
