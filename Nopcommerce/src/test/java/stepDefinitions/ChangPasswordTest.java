package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ChangPassWord;

public class ChangPasswordTest {
    ChangPassWord resetPW =new ChangPassWord(Hook.driver);


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
