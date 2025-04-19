package ondia.stepdefinitions;

import io.cucumber.java.en.*;
import ondia.pages.EvilTesterSimpleNotesPage;
import org.junit.Assert;

public class Homework_stepdefinitions {

    EvilTesterSimpleNotesPage simpleNotesPage = new EvilTesterSimpleNotesPage();

    @And("user adds title on simple note taker page {string}")
    public void userAddsTitleOnSimpleNoteTakerPage(String title) {
        simpleNotesPage.setTitleInput( title);
    }

    @And("user adds note on simple note taker page {string}")
    public void userAddsNoteOnSimpleNoteTakerPage(String note) {
        simpleNotesPage.setNoteInput(note);
    }

    @Then("user clicks Add button on simple note taker page")
    public void user_clicks_add_button_on_simple_note_taker_page() {
        simpleNotesPage.clickAddNoteButton();
    }


    @Then("verify {string} isAddedSuccesfully")
    public void verifyIsAddedSuccesfully(String expectedResult) {
        Assert.assertTrue( simpleNotesPage.verifyTextFromList(expectedResult));
    }


}
