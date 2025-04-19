package ondia.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ondia.pages.EvilTesterFormDetailsPage;
import ondia.pages.EvilTesterFormPage;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class EvilTest_stepdefinitions {

    EvilTesterFormPage formPage = new EvilTesterFormPage();

    @When("user enters form username {string}")
    public void userEntersFormUsername(String name) {
        formPage.enterUserName(name);
    }

    @And("user enters form password {string}")
    public void userEntersFormPassword(String password) {
        formPage.enterPassword(password);
    }

    @And("user enters form comment {string}")
    public void userEntersFormComment(String comment) {
        formPage.enterComment(comment);
    }

    @And("user clicks on form submit")
    public void userClicksOnFormSubmit() {
        formPage.clickSubmit();
    }


    EvilTesterFormDetailsPage formDetailsPage = new EvilTesterFormDetailsPage();

    @Then("user validates comment include {string}")
    public void userValidatesCommentInclude(String comment) {
        Assert.assertTrue(formDetailsPage.isCommentLineContain(comment));
    }


    @When("user enters username and comment")
    public void user_enters_username_and_comment(DataTable dataTable) {
        Map<String,String> dataMap = dataTable.asMap();
        formPage.enterUserNameAndComment(dataMap);

    }

    @When("user enters username password and comment")
    public void user_enters_username_password_and_comment(DataTable dataTable) {
        List<List<String>> listOfCredentials = dataTable.asLists();
        formPage.enterCredentials(listOfCredentials);
    }
}
