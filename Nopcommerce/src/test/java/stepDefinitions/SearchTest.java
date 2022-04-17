package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest {
    SearchPage search = new SearchPage((Hook.driver));
    HomePage logo = new HomePage(Hook.driver);

    @When("user click on homepage")
    public void logoClick(){
        logo.homepageLogo();  }
    @And("user click on button search")
    public void userSearch(){
        search.searchTxtMethod("laptop");
    }
    @Then("user could find relative result")
    public void relativeResultTest(){
        search.relResult();


    }

}
