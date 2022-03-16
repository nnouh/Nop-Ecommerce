package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationConfirmationPage;
import pages.RegistrationFormPage;

public class Registration {
   //String url = "https://demo.nopcommerce.com/";

    @Given("navigate to the homepage url")
    public void navigateToHomePage(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
        Hook.driver.manage().window().maximize();
    }
    @When("user click on register button")
    public void clickOnRegistBtn(){
        HomePage hpage = new HomePage(Hook.driver);
        hpage.clickRegBtn();
    }
    @And("fill valid data into registration form")
    public void regFormInsertData(){
        RegistrationFormPage regForm = new RegistrationFormPage(Hook.driver);
        regForm.regFormData("Nashwa", "Nouh", "my@gmail.com", "Nashwa@123");
    }
    @And("click on submit button")
    public void subBtnClick(){
        RegistrationFormPage subBtn = new RegistrationFormPage(Hook.driver);
        subBtn.regBtnSub();
    }
    @Then("user should be find message")
    public void conMsgTxt(){
        RegistrationConfirmationPage coMsg = new RegistrationConfirmationPage(Hook.driver);
        Assert.assertEquals(coMsg.confirmationMessage(),"Your registration completed");
        //System.out.println(coMsg.confirmationMessage());
    }


}
