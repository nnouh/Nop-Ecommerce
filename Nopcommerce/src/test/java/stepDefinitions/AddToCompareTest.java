package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddToCompareList;
import pages.HomePage;

public class AddToCompareTest {

AddToCompareList compare = new AddToCompareList(Hook.driver);

@When("go to homepage logo to Add to compare list")
 public void hompgClick(){
     HomePage hom =new HomePage(Hook.driver);
     hom.homepageLogo();
    }
    @And("click on link Apparel to compare list")
    public void categClickComTest(){
    compare.categClickCom();
    }
    @And("click on shose item to compare list")
    public void itemClickComTest(){
    compare.itemClickCom();
    }
    @Then("Click on Add to compare list")
    public void addCompareClickTest(){
    compare.addCompareClick();
    }
    @And("check the text to compare list assert")
    public void txtAssertComTest(){
    String fComassert= compare.txtAssertFirstCom();
       Assert.assertEquals(fComassert, "The product has been added to your product comparison");
       System.out.println(fComassert);
    }

@When("click on link book to add to compare list")
   public void categClickSecondComTest(){
   compare.categClickSecondCom();
}
@And("click on second item to compare list")
   public void itemClickSecondComTest(){
   compare.itemClickSecondCom();
}
@Then("Click on Add to compare list second")
   public void addComClickSecondTest(){
   compare.addComClickSecond();
}
@And("check the text to assert second to compare list")
   public void txtAssertSecondComTest(){
   String stxtC=compare.txtAssertSecondCom();
   Assert.assertEquals(stxtC, "The product has been added to your product comparison");
   System.out.println(stxtC);

}


}
