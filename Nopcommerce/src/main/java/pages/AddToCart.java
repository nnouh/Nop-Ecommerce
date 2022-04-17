package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    private By catLink = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]");
    private By itemProd = By.xpath("//div[@class=\"product-item\"]/div/h2/a[@href=\"/fahrenheit-451-by-ray-bradbury\"]");
    private By itemAddToCart = By.xpath("//div[@class=\"add-to-cart-panel\"]/button[@id=\"add-to-cart-button-37\"]");
    private By fistTxt = By.xpath("//div[@class=\"bar-notification success\"]/p[@class=\"content\"]");
    //second item
    private By catLinkSItem = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]");
    private By itemProdSItem = By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/if-you-wait-donation\"]");
    private By itemAddToCartSItem = By.xpath("//div[@class=\"add-to-cart-panel\"]/button[@id=\"add-to-cart-button-35\"]");
    private By fistTxtSItem = By.xpath("//div[@class=\"bar-notification success\"]/p[@class=\"content\"]");

    public void categClick() {

        driver.findElement(catLink).click();

    }

    public void itemClick() {

        driver.findElement(itemProd).click();
    }

    public void addCartClick() {

        driver.findElement(itemAddToCart).click();
    }

    public String txtAssertfirst() {
        String firstItemTxt = driver.findElement(fistTxt).getText();
        //Assert.assertEquals(firstItemTxt, "The product has been added to your shopping cart");
       // System.out.println(firstItemTxt);
        return firstItemTxt;
    }

    // Second item
    public void categClickSecond() {

        driver.findElement(catLinkSItem).click();

    }

    public void itemClickSecond() {

        driver.findElement(itemProdSItem).click();
    }

    public void addCartClickSecond() {

        driver.findElement(itemAddToCartSItem).click();
    }

    /* public void txtAssertSecond(){
         String secondItemTxt = driver.findElement(fistTxtSItem).getText();
         Assert.assertEquals(secondItemTxt, "The product has been added to your shopping cart");
         System.out.println(secondItemTxt);
     }*/
    public String txtAssertSecond() {
        String secondItemTxt = driver.findElement(fistTxtSItem).getText();
        return secondItemTxt;
    }



}
