package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SelectTags;

public class SelectTagsTest {

    // HomePage hpselTag =new HomePage(Hook.driver);
    SelectTags seltag = new SelectTags(Hook.driver);

    @When("user go to homePg direct")
    public void computerSelTag() {
        seltag.clickonComputerlnk();
    }

    @And("click on tage book")
    public void selBookTage() {
        seltag.firstTag();
    }
@And("assert on the tag book")
 public void firstTagAssertionTst(){
        String ftag =seltag.firstTagAssert();
    Assert.assertEquals(ftag, "Products tagged with 'book'");
    System.out.println(ftag);


}
    @And("click on second tag")
    public void selSecondTag() {
        seltag.secondTag();
    }
    @And("assert on second tag")
    public void secondTagAssertionTst(){
        String sTag = seltag.secondTagAssertion();
        Assert.assertEquals(sTag, "Products tagged with 'computer'");
        System.out.println(sTag);
    }
}