package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddToWishList {

    WebDriver driver;

    public AddToWishList(WebDriver driver){
        this.driver=driver;
    }
    private By shoseAp = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul[@class=\"sublist first-level\"]/li[1]/a[@href=\"/shoes\"]");
    private By shoseItem = By.xpath("//div[@class=\"product-item\"]/div/h2[@class=\"product-title\"]/a[@href=\"/adidas-consortium-campus-80s-running-shoes\"]");
    private By addToWish = By.xpath("//div[@class=\"add-to-wishlist\"]/button[@id=\"add-to-wishlist-button-25\"]");
     private By assertTxt = By.xpath("//p[@class=\"content\"]");
// second item
private By catLink = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]");
    private By itemProd = By.xpath("//div[@class=\"product-item\"]/div/h2/a[@href=\"/fahrenheit-451-by-ray-bradbury\"]");
    private By addToWishS = By.xpath("//button[@id=\"add-to-wishlist-button-37\"]");
    private By secondTxt = By.xpath("//p[@class=\"content\"]");

    public void wishListHover(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]"))).perform();
        driver.findElement(shoseAp).click();
    }
    public void shoseItemClick(){
        driver.findElement(shoseItem).click();
        Select selSize = new Select(driver.findElement(By.xpath("//dd[@id=\"product_attribute_input_9\"]/select[@id=\"product_attribute_9\"]")));
       selSize.selectByIndex(2);
    }
    public void addTowishlist(){
        driver.findElement(addToWish).click();

    }
    public String firstAddToWishListAssertion(){
        String wishTxt =driver.findElement(assertTxt).getText();
        Assert.assertEquals(wishTxt, "The product has been added to your wishlist");
        System.out.println(wishTxt);
        return wishTxt;

    }

    // second item Methods
    public void catLinkW(){
        driver.findElement(catLink).click();
    }
    public void bookClick(){
        driver.findElement(itemProd).click();
    }
    public void addToWishS(){
        driver.findElement(addToWishS).click();
    }
    public String secondwishListassert(){
        String assTxt =driver.findElement(secondTxt).getText();
        Assert.assertEquals(assTxt,"The product has been added to your wishlist");
        System.out.println(assTxt);
        return assTxt;
    }


}
