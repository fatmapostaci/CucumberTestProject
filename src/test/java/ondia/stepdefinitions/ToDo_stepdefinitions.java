package ondia.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import ondia.pages.ToDoesPage;
import java.util.List;

// Write code here that turns the phrase above into concrete actions
// For automatic transformation, change DataTable to one of
// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
// Double, Byte, Short, Long, BigInteger or BigDecimal.
//
// For other transformations you can register a DataTableType.


public class ToDo_stepdefinitions {

    ToDoesPage toDoesPage = new ToDoesPage();

    @When("user enters todos")
    public void user_enters_todos(DataTable dataTable) {
        List<String> todoList = dataTable.asList();
        toDoesPage.addNewTodoAsList(todoList);

    }
}