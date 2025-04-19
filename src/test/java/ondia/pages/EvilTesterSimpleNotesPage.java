package ondia.pages;

import ondia.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EvilTesterSimpleNotesPage {

    @FindBy(id="note-title-input")
    private WebElement titleInput;

    @FindBy(id="note-details-input")
    private WebElement noteInput;

    @FindBy(id="add-note")
    private WebElement addNoteButton;

    @FindBy(xpath = "//div[@id=\"list-of-notes\"]//p")
    private List<WebElement> titlesList;

    public EvilTesterSimpleNotesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void setTitleInput(String title){
        titleInput.sendKeys(title);
    }


    public void setNoteInput(String note){
        noteInput.sendKeys(note);
    }

    public void clickAddNoteButton(){
        addNoteButton.click();
    }

    public boolean verifyTextFromList(String expectedResult){
        boolean flag=false;
        for (WebElement w : titlesList){
            if( w.getText().contains(expectedResult))
                flag= true;
        }
        return flag;
    }

}

