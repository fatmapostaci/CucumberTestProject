package ondia.stepdefinitions;

import io.cucumber.java.en.*;
import ondia.pages.ContactListHomePage;
import ondia.pages.ContactListLoginPage;
import ondia.utils.ConfigReader;
import ondia.utils.Driver;
import org.junit.Assert;

public class ContactList_stepdefinitions {


    ContactListLoginPage loginPage = new ContactListLoginPage();
    ContactListHomePage homePage = new ContactListHomePage();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));
    }

    @When("user enters email")
    public void user_enters_email() {
        loginPage.enterEmail(ConfigReader.getProperty("contact_list_username"));
    }

    @When("user enters password")
    public void user_enters_password() {
        loginPage.enterPassword(ConfigReader.getProperty("contact_list_password"));
    }

    @And("user clicks on submit")
    public void userClicksOnSubmit() {
        loginPage.clickSubmit();
    }


    @Then("user validates sign in")
    public void user_validates_sign_in() {

        Assert.assertTrue(homePage.isAddContactButtonVisible());
        Assert.assertTrue(homePage.isLogoutButtonVisible());
        Assert.assertTrue(homePage.isUrlContains("contactList"));
    }



    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
        loginPage.enterPassword(ConfigReader.getProperty("contact_list_wrong_password"));
    }

    @Then("user validates error message")
    public void userValidatesErrorMessage() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @When("user enters invalid email")
    public void userEntersInvalidEmail() {
        loginPage.enterEmail(ConfigReader.getProperty("contact_list_wrong_username"));
    }

    @When("user enters email {string}")
    public void userEntersEmail(String email) {
        loginPage.enterEmail(email);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String pass) {
        loginPage.enterPassword(pass);
    }
}
