package ondia.stepdefinitions;

import io.cucumber.java.en.Then;
import ondia.utils.Driver;

public class Common_stepdefinitions {

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }
}
