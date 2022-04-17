package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RandomCategories;

public class RandomCategoryTest {

    RandomCategories rCate =new RandomCategories(Hook.driver);
    HomePage hpLog = new HomePage(Hook.driver);
    @When("go to the homepage first")
    public void homepLog(){
        hpLog.homepageLogo();
    }
    @Then("user select category")
    public void selectCategory(){
        rCate.selectCategory();


    }
}
