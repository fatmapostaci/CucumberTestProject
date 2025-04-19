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
        PageFactory.initElements(getDriver(),this);
    }

    public void enterUserName(String username){
        userNameField.sendKeys(username);
    }
    public void enterPassword(String pass){
        passwordField.sendKeys(pass);
    }
    public void enterComment(String comm){
        commentField.clear();
        commentField.sendKeys(comm);
    }
    public void clickSubmit(){
        submitButton.click();
    }


    public void enterUserNameAndComment(Map<String, String> dataMap) {
        for ( Map.Entry<String, String> entry: dataMap.entrySet()){
            userNameField.sendKeys(entry.getKey());
            commentField.clear();
            commentField.sendKeys(entry.getValue());
        }
    }

    public void enterCredentials(List<List<String>> listOfCredentials) {
        for (List<String> credentials : listOfCredentials){
            userNameField.sendKeys(credentials.get(0));
            passwordField.sendKeys(credentials.get(1));
            commentField.sendKeys(credentials.get(2));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            userNameField.clear();
            passwordField.clear();
            commentField.clear();

        }


    }














}