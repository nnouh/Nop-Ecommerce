package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Login;

import java.util.concurrent.TimeUnit;

public class LoginTest  {
    Login login;
    Login logSubmit;
    @Given("go to the homepage")
public void navigateToHomePageLogin(){
    Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    Hook.driver.manage().window().maximize();
    Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
}
 @When("user click on login link")
    public void loginLink(){
     HomePage hplogin = new HomePage(Hook.driver);
     hplogin.loginLink();
 }
   @And("insert valid data")
    public void loginSubmit(){
     login = new Login(Hook.driver);
     login.credintionalValue("my2@gmail.com", "Nashwa@123");
 }





}
