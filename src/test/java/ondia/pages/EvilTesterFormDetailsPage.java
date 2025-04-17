package ondia.pages;

import static ondia.utils.Driver.getDriver;

public class EvilTesterFormDetaisPage {
    @FindBy(id = "_valuecomments")
    private WebElement commentLine;


    public EvilTesterFormDetaisPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public boolean isCommentLineContain(String comm) {
        return commentLine.getText().contains(comm);
    }


}