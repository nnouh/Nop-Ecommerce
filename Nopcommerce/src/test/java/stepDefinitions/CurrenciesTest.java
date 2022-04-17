package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Currencies;
import pages.HomePage;

public class CurrenciesTest {

    HomePage  HPLogo = new HomePage(Hook.driver);
    Currencies selectValuelDDl = new Currencies(Hook.driver);

    @When("user click on homepage logo")
    public void homPageLogo()
    {HPLogo.homepageLogo();
    }
    @Then("user click on currencies US-Euro")
    public void selectValue(){
        selectValuelDDl.selectDDl();

    }



}
