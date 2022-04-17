package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddToCart;
import pages.HomePage;

public class AddToCartTest {
    AddToCart cart = new AddToCart(Hook.driver);

@When("go to homepage logo to Add")
    public void logClick() {
    HomePage lg = new HomePage(Hook.driver);
    lg.homepageLogo();
}
   @And ("click on link Book")
   public void catClickTest(){
       cart.categClick();
   }
   @And("click on book item.")
   public void itemClick(){
    cart.itemClick();
   }
    @Then ("Click on Add to Cart")
    public void addcartClick(){
    cart.addCartClick();
    }
    @And("check the text")
    public void assertTxtFTest(){
    String addToCart = cart.txtAssertfirst();
       Assert.assertEquals(addToCart,"The product has been added to your shopping cart");
        System.out.println(addToCart);

    }

    // Second Item
    @When ("click on link Book to add second item")
    public void catClickTestSecond(){
        cart.categClickSecond();
    }

    @And("click on book item to add second item")
    public void itemClickSecond(){
        cart.itemClickSecond();
    }

    @Then ("Click on Add to Cart to add second item")
    public void addcartClickSecond(){
        cart.addCartClickSecond();
    }
    @And("check the text to add second item")
    public void assertTxtSecondTest(){
       String secondItem = cart.txtAssertSecond();
       Assert.assertEquals(secondItem, "The product has been added to your shopping cart");
       System.out.println(secondItem);
    }

}
