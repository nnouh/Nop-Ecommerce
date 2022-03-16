package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ChangPassWord;
import pages.HomePage;
import pages.Login;

import java.util.concurrent.TimeUnit;

public class ChangPasswordTest {
    ChangPassWord resetPW =new ChangPassWord(Hook.driver);

   /*@Before("user go to home page")
    public void goToHomePageLogin(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
        Hook.driver.manage().window().maximize();
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }*/



    @When("click on my account link")
    public void myAccountclick(){
        resetPW.myAccountLink();
    }
    @And("click on change password")
    public void changeLink(){
         resetPW.changPWlnk();
    }
    @And("add new password")
    public void addNewPw(){
        resetPW.insertNewPW("Nashwa@123", "Nnouh@123", "Nnouh@123");
    }
    @And("click on button reset")
    public void resetPwBton(){
        resetPW.changPwBtnClick();
    }

}
