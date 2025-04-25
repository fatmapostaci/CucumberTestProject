package ondia.pages;

import ondia.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappLoginPage {

    @FindBy(id="username")
    WebElement usernameElement ;

    @FindBy(id="password")
    WebElement passwordElement;

    @FindBy(className="radius")
    WebElement submitButton;

    @FindBy(xpath = "//div[@id='flash-messages']")
    WebElement invalidLoginText;

    public HerokuappLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void sendUsernameAndPasword(String username,String password){

        usernameElement.clear();
        usernameElement.sendKeys(username);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickSubmitButton() {
            submitButton.click();

    }

    public void assertLoginOccurred() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(invalidLoginText.isDisplayed());
    }
}
