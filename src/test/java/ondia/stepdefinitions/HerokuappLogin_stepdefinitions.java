package ondia.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import ondia.pages.HerokuappLoginPage;

import java.util.List;

public class HerokuappLogin_stepdefinitions {

    HerokuappLoginPage herokuappLoginPage = new HerokuappLoginPage();

    @When("user enters username and password on eviltesterpage")
    public void userEntersUsernameAndPasswordOnEviltesterpage(DataTable datatable) {
        List<List<String>> dataList = datatable.asLists();
        for (List<String> w : dataList) {
            herokuappLoginPage.sendUsernameAndPasword(w.get(0), w.get(1));
            herokuappLoginPage.clickSubmitButton();
            try {
                herokuappLoginPage.assertLoginOccurred();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
