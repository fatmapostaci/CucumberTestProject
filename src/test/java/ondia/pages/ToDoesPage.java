package ondia.pages;

import ondia.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToDoesPage {
    @FindBy(tagName = "input")
    private WebElement addToDoElement;

    public ToDoesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


     public void addNewTodo(String todo){
         addToDoElement.click();
         addToDoElement.sendKeys(todo + Keys.ENTER);

    }

    public void addNewTodoAsList(List<String> todoList) {

        for (String todo : todoList ){
            addNewTodo(todo);
        }
    }
}
