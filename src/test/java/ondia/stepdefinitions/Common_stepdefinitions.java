package ondia.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ondia.utils.Driver;

public class Common_stepdefinitions {


    @Given("user goes to url {string}")
    public void userGoesToUrl(String url) {
        Driver.getDriver().get(url);
    }


    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }
}
