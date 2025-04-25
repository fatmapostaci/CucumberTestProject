package ondia.stepdefinitions;

import io.cucumber.java.en.*;
import static ondia.utils.ParallelDriver.*;



public class ParallelTest_stepdefinitions {
    @Given("user goes to URL {string}")
    public void userGoesToURL(String url) {
        getDriver().get(url);
    }

    @When("user prints the title")
    public void userPrintsTheTitle() {
        System.out.println("title : "+getDriver().getTitle());
    }


    @Then("close parallel driver")
    public void closeParallelDriver() {
        closeDriver();

    }
}
