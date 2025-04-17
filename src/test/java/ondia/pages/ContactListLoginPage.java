package ondia.pages;

import ondia.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactListLoginPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(2));

    //1.adım -> elementleri locate et
    @FindBy(id = "email")
    private WebElement emailBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "signup")
    private WebElement signupButton;

    @FindBy(id="error")
    private WebElement errorMessage;


    //2.adım ->PageFactory init Elements diyince elementler etkileşime geçilebilir hale geliyor
    public ContactListLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //3.adım ->kullanacağım methodları yazmalıyım

    public void enterEmail(String email) {
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }
    public boolean isErrorMessageDisplayed(){
        return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();

    }
}
