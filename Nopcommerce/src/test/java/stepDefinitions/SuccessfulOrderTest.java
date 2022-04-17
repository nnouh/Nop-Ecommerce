package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SuccessfulOrder;

public class SuccessfulOrderTest {

    SuccessfulOrder succ = new SuccessfulOrder(Hook.driver);




    @When("click on shipping cart")
    public void shippingCart(){

        succ.cartShipp();
    }
    @And("fill the form")
     public void fillTheForm(){
        succ.continueBtn("Cairo", "Nasr City", "12344", "123456777");
    }
  @And("click on second tab")
    public void clickOnSecondTab(){
        succ.secondTab();
  }
  @And("click on payment button")
    public void paymenTest(){
        succ.paymentMth();
  }
  @And("payment Information")
    public void paymentInfoTest(){
        succ.paymentInfo();
  }
  @And("confirm order")
    public void confPaymenTest(){
        succ.confirmPayment();
  }
  @Then("assert the text")
    public void asserTxt(){
       String thanksTxt= succ.assertOrderShip();
      Assert.assertEquals(thanksTxt,"Thank you");
      System.out.println(thanksTxt);
  }


}
