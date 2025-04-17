package ondia.pages;

import ondia.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MentoringEviltesterPage {

    @FindBy(id = "tablestest")
    private WebElement tableTestLink;

    @FindBy(xpath = "//table[@id='mytable']//tbody//tr[td]")    //sadece td içeren tr leri sayar (th içeren tr leri almaz)
    private List<WebElement> trTagList;

    public MentoringEviltesterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickTableTestLink() {
        tableTestLink.click();
    }

    public boolean findName(String name) {
        boolean flag = false;
        for (WebElement element : trTagList) {
            if (element.getText().contains(name))
                flag=true;
        }
        return flag;
    }

    public String amountOfBob(){
        String result="";
        for(WebElement w : trTagList){
            List<WebElement> cells = w.findElements(By.tagName("td"));
            if(cells.size()>=2){
                String name = cells.get(0).getText();  //name getirir
                String amount = cells.get(1).getText();  //amount getirir

                if(name.equals("Bob"))
                    result=amount;
            }

        }
        return result;
    }

    public int countNumberOfRows() {
        System.out.println("trTagList = " + trTagList.size());
        return trTagList.size();
    }

    public boolean findACellInWebtable( String arg){
       boolean result = false;
        for (WebElement w : trTagList){
            List<WebElement> cells = w.findElements(By.tagName("td"));

            System.out.println("cells.getFirst() = " + cells.getFirst().getText());
            System.out.println("cells.getLast() = " + cells.getLast().getText());

            if(cells.getLast().getText().contains(arg)) {
                System.out.println("w.getText() true= " + w.getText());
                result= true;
            }

        }
        return result;
    }
}
