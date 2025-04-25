package ondia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

import static ondia.utils.Driver.getDriver;

public class EvilTesterFormPage {
    @FindBy(name = "username")
    private WebElement userNameField;
    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(name = "comments")
    private WebElement commentField;
    @FindBys({
            @FindBy(name = "submitbutton"),
            @FindBy(xpath = "//input[@value='submit']")
    })
    private WebElement submitButton;

    public EvilTesterFormPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void enterUserName(String username) {
        userNameField.sendKeys(username);
    }

    public void enterPassword(String pass) {
        passwordField.sendKeys(pass);
    }

    public void enterComment(String comm) {
        commentField.clear();
        commentField.sendKeys(comm);
    }

    public void clickSubmit() {
        submitButton.click();
    }


    public void enterUserNameAndComment(Map<String, String> dataMap) {
        boolean isAllDataEntered = true;
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            userNameField.clear();
            userNameField.sendKeys(entry.getKey());
            commentField.clear();
            commentField.sendKeys(entry.getValue());

            // Gerçel bir senaryoya çevirmek istersek
            submitButton.click();
            EvilTesterFormDetailsPage detailsPage = new EvilTesterFormDetailsPage();
            if (!detailsPage.isCommentLineContain(entry.getValue())) {
                isAllDataEntered = false;
                getDriver().get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
            }
            getDriver().navigate().back();

        }
    }

    public void enterCredentials(List<List<String>> listOfCredentials) {

        boolean isAllDataEntered = true;
        for (List<String> credentials : listOfCredentials) {
            userNameField.clear();
            userNameField.sendKeys(credentials.get(0));
            passwordField.clear();
            passwordField.sendKeys(credentials.get(1));
            commentField.clear();
            commentField.sendKeys(credentials.get(2));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Seneryayo çevirirsek
            submitButton.click();
            EvilTesterFormDetailsPage detailsPage = new EvilTesterFormDetailsPage();
            if (!detailsPage.isCommentLineContain(credentials.get(2))) {
                isAllDataEntered = false;
                getDriver().get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
            }
            getDriver().navigate().back();
        }
        System.out.println("Bütün değerler başarı ile girildi : " + isAllDataEntered);
    }


}














