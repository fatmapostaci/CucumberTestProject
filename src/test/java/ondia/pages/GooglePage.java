package ondia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ondia.utils.Driver.getDriver;

public class GooglePage {
    @FindBy(name = "q")
    public WebElement searchBox;

    public GooglePage() {
        PageFactory.initElements(getDriver(),this);
    }

}
