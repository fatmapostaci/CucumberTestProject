package ondia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ondia.utils.Driver.getDriver;

public class EvilTesterFormDetailsPage {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    @FindBy(id = "_valuecomments")
    private WebElement commentLine;


    public EvilTesterFormDetailsPage() {
        PageFactory.initElements(getDriver(),this);
    }

    public boolean isCommentLineContain(String comm){
        wait.until(ExpectedConditions.visibilityOf(commentLine));
        return commentLine.getText().contains(comm);
    }


}