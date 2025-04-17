package ondia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ondia.utils.Driver.getDriver;

public class ContactListHomePage {

    @FindBy(id="logout")
    public WebElement logoutButton;

    @FindBy(id="add-contact")
    public WebElement addContactButton;

    public ContactListHomePage() {

        PageFactory.initElements(getDriver(),this);
    }

    public boolean isLogoutButtonVisible(){
        return logoutButton.isDisplayed();
    }
    public boolean isAddContactButtonVisible(){
        return addContactButton.isDisplayed();
    }
    public boolean isUrlContains(String text){
        return getDriver().getCurrentUrl().contains(text);
    }
    public void clickLogoutButton(){
        logoutButton.click();
    }
}
