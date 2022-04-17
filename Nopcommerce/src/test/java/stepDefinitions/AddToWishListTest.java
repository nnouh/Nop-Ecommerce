package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddToWishList;
import pages.HomePage;

public class AddToWishListTest {
    AddToWishList addList = new AddToWishList(Hook.driver);

    @When("go to homepage logo to Add to wish list")
    public void go_to_homepg() {
        HomePage hplg = new HomePage(Hook.driver);
        hplg.homepageLogo();
    }
    @And("click on link Apparel")
    public void clickOnApparel(){
        addList.wishListHover();
    }
    @And("click on shose item")
    public void shoseItemClick(){
        addList.shoseItemClick();
    }
    @Then("Click on Add to wish list")
    public void addWishList(){
        addList.addTowishlist();
    }
    @And("check the text to assert")
    public void TxtAssertion(){
       String fWishList= addList.firstAddToWishListAssertion();
        Assert.assertEquals(fWishList, "The product has been added to your wishlist");
        System.out.println(fWishList);
    }
    // second item to wish list
    @When("click on link book to add to wish")
    public void catLinkClick(){
        addList.catLinkW();
    }
    @And("click on second item")
    public void bookItem(){
        addList.bookClick();
    }
    @Then("Click on Add to wishList")
    public void addToWishList(){
        addList.addToWishS();
    }
    @And("check the text to assert second")
    public void assertTxt(){
        String sitemtxt= addList.secondwishListassert();
        Assert.assertEquals(sitemtxt, "The product has been added to your wishlist");
    }

}
