package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterColor;
import pages.HomePage;

public class FilterColorTest {
    FilterColor fcolor = new FilterColor(Hook.driver);
    HomePage hPage = new HomePage(Hook.driver);

    @When("go to homepage logo")
    public void goToHomepage(){
        hPage.homepageLogo();

    }

    @And("hover on appearl category and click on shoes")
    public void filterByColor() {
        fcolor.hoverCategory();
    }

    @Then("choose red color and click on it")
    public void clickCheckBox(){
        fcolor.chooseColor();
    }

}
